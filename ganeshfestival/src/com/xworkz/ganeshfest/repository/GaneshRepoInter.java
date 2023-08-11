package com.xworkz.ganeshfest.repository;

import java.io.IOException;
import java.sql.SQLException;
import com.xworkz.ganeshfest.dto.GaneshDTO;

public interface GaneshRepoInter {
	boolean onSave(GaneshDTO dto) throws SQLException;
	boolean onUpdate(int id, String newPoojariName) throws SQLException;
	boolean onUpdate(String newPrasada, String poojariName) throws SQLException;
	boolean onUpdate(String area, boolean permissionGranted) throws SQLException;
	boolean onUpdate(int id, float ganeshHeight, int ganeshWeight, String area, String prasada, boolean permissionGranted,
			int noOfDays, String poojariName) throws SQLException;
	boolean onDelete(int id) throws SQLException;
	boolean readAll() throws SQLException;
	boolean searchById(int id) throws SQLException;
	boolean searchByArea(String area) throws SQLException;
	boolean searchByPrasada(String prasada) throws SQLException;
	void writeToExcel() throws SQLException, IOException;
}
