package com.xworkz.passport.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassportDTO implements Serializable {
	private String name;
	private Date dob;
	private String email;
	private Long phoneNumber;
	private String password;
	private String confirmPassword;
	private String passportOffice;
	private Long aadhaarNo;
}
