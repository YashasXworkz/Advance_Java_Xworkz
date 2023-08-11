package com.xworkz.soft.controller;

import java.sql.SQLException;

import com.xworkz.soft.dto.SoftDTO;
import com.xworkz.soft.service.SoftService;
import com.xworkz.soft.service.SoftServiceImpl;

public class Runner {
	public static void main(String[] args) throws SQLException {
		SoftDTO dto = new SoftDTO();
		dto.setId(3);
		dto.setUname("mani");
		dto.setEmail("mani23@gmail.com");
		dto.setPhone(8672902388L);
		dto.setVersion(21.2f);
		dto.setDOE("2027-08-17");
		dto.setPassword("890");
		dto.setPrice(899);
		dto.setOsVersion("A1H2");
		dto.setSoftName("avastantivirus");
		System.out.println(dto.toString());

		SoftService se = new SoftServiceImpl();
		se.validateAndSave(dto);
		se.validateAndSearch(21.2f);
		se.validateAndSearch(2);
		se.validateAndSearch("windows");
		se.onReadAll();

		SoftDTO dto2 = new SoftDTO();
		dto2.setUname("rahul");
		dto2.setEmail("rahul23@gmail.com");
		dto2.setPhone(4572902388L);
		dto2.setVersion(10.1f);
		dto2.setDOE("2030-04-25");
		dto2.setPassword("pass123");
		dto2.setPrice(35566);
		dto2.setOsVersion("INH2");
		dto2.setSoftName("intellj idea");
		se.validateAndUpdate(2, dto2);
		se.validateAndUpdate(565656, 11.2f);
		se.validateAndDelete("windows");
	}
}
