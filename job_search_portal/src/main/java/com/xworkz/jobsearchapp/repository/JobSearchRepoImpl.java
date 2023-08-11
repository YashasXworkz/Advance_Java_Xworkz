package com.xworkz.jobsearchapp.repository;

import com.xworkz.jobsearchapp.dto.UserDTO;

public class JobSearchRepoImpl implements JobSearchRepoInter {
	UserDTO[] userDTO = new UserDTO[50];
	int index = 0;

	@Override
	public boolean addDetails(UserDTO user) {
		boolean isAdded = false;
		if (userDTO != null) {
			userDTO[index++] = user;
			isAdded = true;
		}
		return isAdded;
	}
}
