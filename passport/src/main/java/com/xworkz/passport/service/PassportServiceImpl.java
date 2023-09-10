package com.xworkz.passport.service;

import java.util.List;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepo;
import com.xworkz.passport.repository.PassportRepoImpl;

public class PassportServiceImpl implements PassportService {
	PassportRepo repo = new PassportRepoImpl();

	@Override
	public boolean validateAndSave(PassportDTO dto) {
		System.out.println("Invoked validateAndSave method");
		if (dto != null) {
			System.out.println("DTO object is not null, saving...");
			return repo.onSave(dto);
		} else {
			System.out.println("DTO object is null");
			return false;
		}
	}

	@Override
	public List<PassportEntity> getAll() {
		System.out.println("Invoked getAll method");
		return repo.getAll();
	}

	@Override
	public PassportEntity validateAndGetById(int id) {
		PassportEntity entity = null;
		System.out.println("Invoked validateAndGetById method");
		if (id != 0) {
			entity = repo.getById(id);
			return entity;
		} else {
			return null;
		}
	}

	@Override
	public boolean validateAndUpdate(PassportEntity entity) {
		System.out.println("Invoked validateAndUpdate method");
		if (entity != null) {
			return repo.onUpdate(entity);
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndDelete(int id) {
		System.out.println("Invoked validateAndDelete method");
		if (id != 0) {
			return repo.onDelete(id);
		} else {
			return false;
		}
	}
}

/*
 * @Override
 * public boolean validateAndUpdate(String existingEmail, String newOffice) {
 * System.out.println("Invoked validateAndUpdate method");
 * if (existingEmail != null && !existingEmail.isEmpty() && newOffice != null
 * && !newOffice.isEmpty()) {
 * repo.onUpdate(existingEmail, newOffice);
 * return true;
 * } else {
 * System.out.println("Invalid existingEmail or newOffice");
 * return false;
 * }
 * }
 * @Override
 * public boolean validateAndSearch(int id) {
 * System.out.println("Invoked validateAndSearch method");
 * if (id != 0 && id > 0) {
 * repo.onSearch(id);
 * return true;
 * } else {
 * System.out.println("Invalid ID");
 * return false;
 * }
 * }
 * @Override
 * public List<PassportEntity> getAll() {
 * return repo.getAll();
 * }
 * @Override
 * public List<PassportEntity> searchByEmail(String existingEmail) {
 * System.out.println("Invoked searchByEmail method");
 * if (existingEmail != null && !existingEmail.isEmpty()) {
 * return repo.searchByEmail(existingEmail);
 * } else {
 * System.out.println("email validation failed or email is null or empty");
 * return null;
 * }
 * }
 * @Override
 * public PassportEntity searchByPhone(Long existingPhone) {
 * System.out.println("Invoked searchByPhone method");
 * if (existingPhone != null) {
 * return repo.searchByPhone(existingPhone);
 * } else {
 * System.out.println("Phone number is null");
 * return null;
 * }
 * }
 * @Override
 * public Long getCount() {
 * return repo.getCount();
 * }
 */
