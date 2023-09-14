package com.xworkz.tourism.controller;

import java.util.List;

import com.xworkz.tourism.dto.TourismDTO;
import com.xworkz.tourism.entity.TourismEntity;
import com.xworkz.tourism.service.TourismService;
import com.xworkz.tourism.service.TourismServiceImpl;

public class TourismRunner {
	public static void main(String[] args) {
		TourismDTO dto = new TourismDTO("Yashas", "yashas@gmail.com", 1234567890L, "Mysore", 553723675643L, "AXVPY0727R", 23);

		TourismService service = new TourismServiceImpl();
//		service.validateAndSave(dto);

//		Long result = service.getCount();
//		System.out.println(result);

		List<TourismEntity> resList = service.getAll();
		System.out.println(resList);
	}
}
