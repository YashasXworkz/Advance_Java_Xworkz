package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dto.EcomUserDTO;

public class EcomServiceImpl implements EcomServiceInter {

	@Override
	public boolean validateDTO(EcomUserDTO eUserDTO) {
		boolean verified = true;
		if (eUserDTO != null) {
			if (eUserDTO.getUserName() != null && !eUserDTO.getUserName().isEmpty()) {
				System.out.println("Valid userName");
			} else {
				System.out.println("Invalid userName");
				verified = false;
			}

			if (eUserDTO.getEmailId() != null && !eUserDTO.getEmailId().isEmpty()) {
				System.out.println("Valid email");
			} else {
				System.out.println("Invalid email");
				verified = false;
			}

			if (eUserDTO.getPhoneNumber() != 0 && eUserDTO.getPhoneNumber().toString().length() == 10) {
				System.out.println("Valid phoneNumber");
			} else {
				System.out.println("Invalid phoneNumber");
				verified = false;
			}

			if (eUserDTO.getAddress() != null && !eUserDTO.getAddress().isEmpty()) {
				System.out.println("Valid address");
			} else {
				System.out.println("Invalid address");
				verified = false;
			}

			if (verified) {
				System.out.println("Successfully Verified All");
				System.out.println(eUserDTO);
			} else {
				System.out.println("One of the condition is not valid!");
				return false;
			}
		} else {
			System.out.println("Null Object");
			verified = false;
		}
		return verified;
	}
}
