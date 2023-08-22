package com.xworkz.stackoverflow.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.stackoverflow.dto.StackDTO;
import com.xworkz.stackoverflow.repo.StackRepoImpl;
import com.xworkz.stackoverflow.repo.StackRepoInter;

public class StackServiceImpl implements StackServiceInter {
	StackRepoInter repo = new StackRepoImpl();

	@Override
	public boolean validateAndSave(StackDTO dto) throws SQLException {
		System.out.println("Invoked validateAndSave method");
		if (dto != null) {
			System.out.println("Dto is not null, proceeding to save");
			boolean save = repo.onSave(dto);
			System.out.println(save);
			return true;
		} else {
			System.out.println("Dto is null");
			return false;
		}
	}

	@Override
	public List<StackDTO> getAllDetails() throws SQLException {
		System.out.println("Invoked getAllDetails method");
		List<StackDTO> dtos = repo.getAllDetails();
		return dtos;
	}

	@Override
	public StackDTO getById(int id) throws SQLException {
		System.out.println("Invoked getById method");
		StackDTO dto = null;
		if (id != 0) {
			dto = repo.getById(id);
		}
		return dto;
	}

	@Override
	public boolean validateAndUpdate(StackDTO dto) throws SQLException {
		System.out.println("Invoked validateAndUpdate method");
		if (dto != null) {
			System.out.println("Dto is not null, proceeding to update");
			boolean update = repo.onUpdate(dto);
			System.out.println(update);
			return true;
		} else {
			System.out.println("Dto is null");
			return false;
		}
	}

	@Override
	public boolean validateAndDelete(int id) throws SQLException {
		System.out.println("Invoked validateAndDelete method");
		if (id != 0) {
			boolean delete = repo.onDelete(id);
			System.out.println(delete);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<StackDTO> search(String s) throws SQLException {
		List<StackDTO> dto = null;
		if (s != null) {
			dto = repo.search(s);
		}
		return dto;
	}
}
