package com.xworkz.passport.service;

import java.util.List;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entity.PassportEntity;

public interface PassportService {
	boolean validateAndSave(PassportDTO dto);

	/*
	 * boolean validateAndUpdate(String existingEmail, String newOffice);
	 * boolean validateAndSearch(int id);
	 * List<PassportEntity> getAll();
	 * List<PassportEntity> searchByEmail(String existingEmail);
	 * PassportEntity searchByPhone(Long existingPhone);
	 * Long getCount();
	 */
	List<PassportEntity> getAll();

	PassportEntity validateAndGetById(int id);

	boolean validateAndUpdate(PassportEntity entity);

	boolean validateAndDelete(int id);
}
