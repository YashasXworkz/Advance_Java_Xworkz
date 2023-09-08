package com.xworkz.college.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "collegeinfo")
@NamedQuery(name = "readAll", query = "SELECT dto FROM CollegeDto dto")
public class CollegeDto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private int noOfStudents;
	private int noOfStaffs;

	public CollegeDto(String name, String location, int noOfStudents, int noOfStaffs) {
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.noOfStaffs = noOfStaffs;
	}
}
