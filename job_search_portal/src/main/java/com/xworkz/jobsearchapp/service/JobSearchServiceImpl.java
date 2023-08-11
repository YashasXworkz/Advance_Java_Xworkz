package com.xworkz.jobsearchapp.service;

import com.xworkz.jobsearchapp.dto.UserDTO;
import com.xworkz.jobsearchapp.repository.JobSearchRepoImpl;
import com.xworkz.jobsearchapp.repository.JobSearchRepoInter;

public class JobSearchServiceImpl implements JobSearchServiceInter {
	JobSearchRepoInter repoInter = new JobSearchRepoImpl();

	@Override
	public boolean verifyDetails(UserDTO userDTO) {
		boolean verified = true;
		if (userDTO != null) {
			if (userDTO.getUserName() != null && !userDTO.getUserName().isEmpty()) {
				System.out.println("Valid userName");
			} else {
				System.out.println("Invalid userName");
				verified = false;
			}

			if (userDTO.getEmailId() != null && !userDTO.getEmailId().isEmpty()) {
				System.out.println("Valid email");
			} else {
				System.out.println("Invalid email");
				verified = false;
			}

			if (userDTO.getPhoneNumber() != 0 && userDTO.getPhoneNumber().toString().length() == 10) {
				System.out.println("Valid phoneNumber");
			} else {
				System.out.println("Invalid phoneNumber");
				verified = false;
			}

			if (userDTO.getAddress() != null && !userDTO.getAddress().isEmpty()) {
				System.out.println("Valid address");
			} else {
				System.out.println("Invalid address");
				verified = false;
			}
		} else {
			System.out.println("Null Object");
			verified = false;
		}

		if (verified) {
			System.out.println("Successfully Verified All");
			repoInter.addDetails(userDTO);
			System.out.println(userDTO);
			return verified;
		} else {
			System.out.println("One of the condition is not valid!");
			return false;
		}
	}
}
