package com.xworkz.ganeshfest;

import java.io.IOException;
import java.sql.SQLException;
import com.xworkz.ganeshfest.dto.GaneshDTO;
import com.xworkz.ganeshfest.service.GaneshServiceImpl;
import com.xworkz.ganeshfest.service.GaneshServiceInter;

public class Runner {
	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("Invoked main method");
		GaneshDTO dto = new GaneshDTO();
		dto.setId(2);
		dto.setGaneshHeight(15.5f);
		dto.setGaneshWeight(75);
		dto.setArea("vijayanagar");
		dto.setPrasada("curd rice");
		dto.setPermissionGranted(true);
		dto.setNoOfDays(10);
		dto.setPoojariName("ravi bhat");
		System.out.println(dto.toString());

		GaneshServiceInter serviceInter = new GaneshServiceImpl();
		serviceInter.validateAndSave(dto);
		serviceInter.validateAndUpdate(1, "nagaraj bhat");
		serviceInter.validateAndUpdate("ladoo", "nagaraj bhat");
		serviceInter.validateAndUpdate("vijayanagar", false);
		serviceInter.validateAndUpdate(1, 20.5f, 35, "rr nagar", "lemon rice", true, 30, "ramesh sharma");
		serviceInter.validateAndDelete(3);
		serviceInter.readAll();
		serviceInter.searchById(2);
		serviceInter.searchByArea("rr nagar");
		serviceInter.searchByPrasada("curd rice");
		serviceInter.writeToExcel();
	}
}
