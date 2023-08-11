package com.xworkz.soft.service;

import java.sql.SQLException;
import com.xworkz.soft.dto.SoftDTO;

public interface SoftService {
	boolean validateAndSave(SoftDTO dto) throws SQLException;
	boolean validateAndSearch(float proVersion) throws SQLException;
	boolean validateAndSearch(int id) throws SQLException;
	boolean validateAndSearch(String softname) throws SQLException;
	void onReadAll() throws SQLException;
	boolean validateAndUpdate(int id, SoftDTO dto) throws SQLException;
	boolean validateAndUpdate(int newPrice, float version) throws SQLException;
	boolean validateAndDelete(String softname) throws SQLException;
}
