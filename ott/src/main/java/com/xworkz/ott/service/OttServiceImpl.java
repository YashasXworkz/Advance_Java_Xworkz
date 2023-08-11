package com.xworkz.ott.service;

import com.xworkz.ott.dto.ClientDTO;

public class OttServiceImpl implements OttServiceInter {

	@Override
	public boolean validateData(ClientDTO clientDTO) {
		boolean verified = true;
		if (clientDTO != null) {
			if (clientDTO.getUserName() != null && !clientDTO.getUserName().isEmpty()) {
				System.out.println("Valid userName");
			} else {
				System.out.println("Invalid userName");
				verified = false;
			}

			if (clientDTO.getEmailId() != null && !clientDTO.getEmailId().isEmpty()) {
				System.out.println("Valid email");
			} else {
				System.out.println("Invalid email");
				verified = false;
			}

			if (clientDTO.getPhoneNumber() != 0 && clientDTO.getPhoneNumber().toString().length() == 10) {
				System.out.println("Valid phoneNumber");
			} else {
				System.out.println("Invalid phoneNumber");
				verified = false;
			}

			if (clientDTO.getAddress() != null && !clientDTO.getAddress().isEmpty()) {
				System.out.println("Valid address");
			} else {
				System.out.println("Invalid address");
				verified = false;
			}
		} else {
			System.out.println("Null Object");
		}
		return verified;
	}
}
