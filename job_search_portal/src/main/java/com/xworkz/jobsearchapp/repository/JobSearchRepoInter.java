package com.xworkz.jobsearchapp.repository;

import com.xworkz.jobsearchapp.dto.UserDTO;

public interface JobSearchRepoInter {
	boolean addDetails(UserDTO userDTO);
}