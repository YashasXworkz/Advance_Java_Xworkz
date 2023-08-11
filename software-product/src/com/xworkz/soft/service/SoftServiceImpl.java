package com.xworkz.soft.service;

import java.sql.SQLException;
import com.xworkz.soft.dto.SoftDTO;
import com.xworkz.soft.repo.SoftRepo;
import com.xworkz.soft.repo.SoftRepoImpl;

public class SoftServiceImpl implements SoftService {
	SoftRepo repo = new SoftRepoImpl();

	@Override
	public boolean validateAndSave(SoftDTO dto) throws SQLException {
		if (dto != null) {
			System.out.println("dto is not null proceeding to save");
			boolean save = repo.onSave(dto);
			System.out.println(save);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndSearch(float proVersion) throws SQLException {
		if (proVersion != 0) {
			boolean search = repo.onSearch(proVersion);
			System.out.println(search);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndSearch(int id) throws SQLException {
		if (id != 0) {
			boolean search = repo.onSearch(id);
			System.out.println(search);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndSearch(String softname) throws SQLException {
		if (softname != null) {
			boolean search = repo.onSearch(softname);
			System.out.println(search);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void onReadAll() throws SQLException {
		repo.onReadAll();
	}

	@Override
	public boolean validateAndUpdate(int id, SoftDTO dto) throws SQLException {
		if (id != 0 && dto != null) {
			boolean update = repo.onUpdate(id, dto);
			System.out.println(update);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndUpdate(int newPrice, float version) throws SQLException {
		if (newPrice != 0 && version != 0) {
			boolean update = repo.onUpdate(newPrice, version);
			System.out.println(update);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndDelete(String softname) throws SQLException {
		if (softname != null) {
			boolean delete = repo.onDelete(softname);
			System.out.println(delete);
			return true;
		} else {
			return false;
		}
	}
}
