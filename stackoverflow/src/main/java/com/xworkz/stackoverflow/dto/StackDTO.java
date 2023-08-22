package com.xworkz.stackoverflow.dto;

import lombok.Data;

@Data
public class StackDTO {
	private int id;
	private String name;
	private String email;
	private Long phoneNo;
	private String address;
	private int followers;
	private int noOfQuesAnswered;
	private int noOfQuesAsked;
	private String badges;
	private String skills;
	private String memberSince;
}
