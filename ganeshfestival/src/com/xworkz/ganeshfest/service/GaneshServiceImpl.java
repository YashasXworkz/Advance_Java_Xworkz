package com.xworkz.ganeshfest.service;

import java.io.IOException;
import java.sql.SQLException;
import com.xworkz.ganeshfest.dto.GaneshDTO;
import com.xworkz.ganeshfest.repository.GaneshRepoImpl;
import com.xworkz.ganeshfest.repository.GaneshRepoInter;

public class GaneshServiceImpl implements GaneshServiceInter {
	GaneshRepoInter repoInter = new GaneshRepoImpl();

	@Override
	public boolean validateAndSave(GaneshDTO dto) throws SQLException {
		System.out.println("Invoked validateAndSave");
		if (dto != null) {
			System.out.println("dto is not null proceeding to save");
			boolean saved = repoInter.onSave(dto);
			System.out.println(saved);
			return true;
		} else {
			System.out.println("dto is null can't proceed to save");
			return false;
		}
	}

	@Override
	public boolean validateAndUpdate(int id, String newPoojariName) throws SQLException {
		System.out.println("Invoked validateIdAndName method");
		boolean update = false;
		if (id != 0 && newPoojariName != null) {
			update = repoInter.onUpdate(id, newPoojariName);
			System.out.println(update);
		}
		if (update == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndUpdate(String newPrasada, String poojariName) throws SQLException {
		System.out.println("Invoked validatePrasadaPoojariNameAndUpdate method");
		boolean update = false;
		if (newPrasada != null && poojariName != null) {
			update = repoInter.onUpdate(newPrasada, poojariName);
			System.out.println(update);
		}
		if (update == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndUpdate(String area, boolean permissionGranted) throws SQLException {
		System.out.println("Invoked validateAreaPremissionGrantedAndUpdate method");
		boolean update = false;
		if (area != null) {
			update = repoInter.onUpdate(area, permissionGranted);
			System.out.println(update);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndUpdate(int id, float ganeshHeight, int ganeshWeight, String area, String prasada,
			boolean permissionGranted, int noOfDays, String poojariName) throws SQLException {
		System.out.println("Invoked validateAllDetails method");
		boolean update = false;
		if (id != 0 && ganeshHeight != 0 && ganeshWeight != 0 && area != null && prasada != null && noOfDays != 0
				&& poojariName != null) {
			update = repoInter.onUpdate(id, ganeshHeight, ganeshWeight, area, prasada, permissionGranted, noOfDays,
					poojariName);
			System.out.println(update);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validateAndDelete(int id) throws SQLException {
		System.out.println("Invoked validate method");
		boolean delete = false;
		if (id != 0) {
			delete = repoInter.onDelete(id);
			System.out.println(delete);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean readAll() throws SQLException {
		repoInter.readAll();
		return false;
	}

	@Override
	public boolean searchById(int id) throws SQLException {
		System.out.println("Invoked searchById method");
		if (id != 0) {
			boolean read = repoInter.searchById(id);
			System.out.println(read);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean searchByArea(String area) throws SQLException {
		System.out.println("Invoked searchByArea method");
		if (area != null) {
			boolean read = repoInter.searchByArea(area);
			System.out.println(read);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean searchByPrasada(String prasada) throws SQLException {
		if (prasada != null) {
			boolean read = repoInter.searchByPrasada(prasada);
			System.out.println(read);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void writeToExcel() throws SQLException, IOException {
		repoInter.writeToExcel();
	}
}
