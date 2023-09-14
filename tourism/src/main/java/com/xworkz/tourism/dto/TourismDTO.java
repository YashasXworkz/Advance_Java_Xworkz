package com.xworkz.tourism.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourismDTO implements Serializable {
	private String name;
	private String email;
	private Long phoneNo;
	private String places;
	private Long aadhaarNo;
	private String pan;
	private Integer age;
}
