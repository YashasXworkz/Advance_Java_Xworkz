package com.xworkz.soft.repo;

import java.sql.SQLException;
import com.xworkz.soft.dto.SoftDTO;

public interface SoftRepo {
	boolean onSave(SoftDTO dto) throws SQLException;
	boolean onSearch(Float proVersion) throws SQLException;
	boolean onSearch(int id) throws SQLException;
	boolean onSearch(String softname) throws SQLException;
	void onReadAll() throws SQLException;
	boolean onUpdate(int id, SoftDTO dto) throws SQLException;
	boolean onUpdate(int newPrice, float version) throws SQLException;
	boolean onDelete(String softname) throws SQLException;
}
