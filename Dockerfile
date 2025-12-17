FROM gradle:8-jdk21-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle bootJar -x test --no-daemon

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /home/gradle/src/build/libs/*[!-plain].jar /app/app.jar

RUN chmod 644 /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx512m", "-jar", "/app/app.jar"]