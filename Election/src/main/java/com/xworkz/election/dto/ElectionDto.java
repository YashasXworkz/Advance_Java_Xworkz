package com.xworkz.election.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.xworkz.test.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@NamedQuery(name = "readAll", query = "SELECT dto FROM ElectionDto dto")
public class ElectionDto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phoneNumber;
	private int age;
	private String address;
	private int pincode;

	public ElectionDto(String name, long phoneNumber, int age, String address, int pincode) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
		this.pincode = pincode;
	}
}
