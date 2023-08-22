package com.xworkz.stackoverflow.repo;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.stackoverflow.dto.StackDTO;

public interface StackRepoInter {
	boolean onSave(StackDTO dto) throws SQLException;

	List<StackDTO> getAllDetails() throws SQLException;

	StackDTO getById(int id) throws SQLException;

	boolean onUpdate(StackDTO dto) throws SQLException;

	boolean onDelete(int id) throws SQLException;

	List<StackDTO> search(String s) throws SQLException;
}
