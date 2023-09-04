package com.xworkz.passport.repository;

import java.util.List;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entity.PassportEntity;

public interface PassportRepo {
	boolean onSave(PassportDTO dto);

	boolean onUpdate(String existingEmail, String newOffice);

	boolean onSearch(int id);

	List<PassportEntity> getAll();

	List<PassportEntity> searchByEmail(String existingEmail);

	PassportEntity searchByPhone(Long existingPhone);
}
