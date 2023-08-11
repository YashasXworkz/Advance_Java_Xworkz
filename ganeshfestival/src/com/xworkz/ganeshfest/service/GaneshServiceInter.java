package com.xworkz.ganeshfest.service;

import java.io.IOException;
import java.sql.SQLException;
import com.xworkz.ganeshfest.dto.GaneshDTO;

public interface GaneshServiceInter {
	boolean validateAndSave(GaneshDTO dto) throws SQLException;
	boolean validateAndUpdate(int id, String newPoojariName) throws SQLException;
	boolean validateAndUpdate(String newPrasada, String poojariName) throws SQLException;
	boolean validateAndUpdate(String area, boolean permissionGranted) throws SQLException;
	boolean validateAndUpdate(int id, float ganeshHeight, int ganeshWeight, String area, String prasada,
			boolean permissionGranted, int noOfDays, String poojariName) throws SQLException;
	boolean validateAndDelete(int id) throws SQLException;
	boolean readAll() throws SQLException;
	boolean searchById(int id) throws SQLException;
	boolean searchByArea(String area) throws SQLException;
	boolean searchByPrasada(String prasada) throws SQLException;
	void writeToExcel() throws SQLException, IOException;
}
