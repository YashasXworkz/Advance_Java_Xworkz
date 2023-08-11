package com.xworkz.courseapp.service;

import com.xworkz.courseapp.dto.UserDTO;

public class CourseServiceImpl implements CourseServiceInter {

	@Override
	public boolean verifyDetails(UserDTO userDTO) {
		boolean verifiedUserName = false;
		boolean verifiedEmail = false;
		boolean verifiedPhoneNumber = false;
		boolean verifiedAddress = false;
		boolean allVerified = false;

		if (userDTO != null) {
			if (userDTO.getUserName() != null && !userDTO.getUserName().isEmpty()) {
				System.out.println("Valid userName");
				verifiedUserName = true;
			} else {
				System.out.println("Invalid userName");
			}

			if (userDTO.getEmailId() != null && !userDTO.getEmailId().isEmpty()) {
				System.out.println("Valid email");
				verifiedEmail = true;
			} else {
				System.out.println("Invalid email");
			}

			if (userDTO.getPhoneNumber() != 0 && userDTO.getPhoneNumber().toString().length() == 10) {
				System.out.println("Valid phoneNumber");
				verifiedPhoneNumber = true;
			} else {
				System.out.println("Invalid phoneNumber");
			}

			if (userDTO.getAddress() != null && !userDTO.getAddress().isEmpty()) {
				System.out.println("Valid address");
				verifiedAddress = true;
			} else {
				System.out.println("Invalid address");
			}

			allVerified = verifiedUserName && verifiedEmail && verifiedPhoneNumber && verifiedAddress;
			if (allVerified) {
				System.out.println("Successfully Verified All");
			} else {
				System.out.println("One of the condition is not valid");
			}
		} else {
			System.out.println("Null Parameter");
		}
		return allVerified;
	}
}
