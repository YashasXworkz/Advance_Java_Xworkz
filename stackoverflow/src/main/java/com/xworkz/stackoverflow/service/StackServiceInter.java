package com.xworkz.stackoverflow.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.stackoverflow.dto.StackDTO;

public interface StackServiceInter {
	boolean validateAndSave(StackDTO dto) throws SQLException;

	List<StackDTO> getAllDetails() throws SQLException;

	StackDTO getById(int id) throws SQLException;

	boolean validateAndUpdate(StackDTO dto) throws SQLException;

	boolean validateAndDelete(int id) throws SQLException;

	List<StackDTO> search(String s) throws SQLException;
}
