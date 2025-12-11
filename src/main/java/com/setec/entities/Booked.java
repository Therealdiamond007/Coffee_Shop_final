package com.setec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Booked {
	@Id
	@GeneratedValue
	
	private Integer id;
	private String name;
	private String phoneNumber;
	private String email;
	private String date;
	private String time;
	private int person;

}
