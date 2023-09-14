package com.xworkz.tourism.service;

import java.util.List;

import com.xworkz.tourism.dto.TourismDTO;
import com.xworkz.tourism.entity.TourismEntity;

public interface TourismService {
	boolean validateAndSave(TourismDTO dto);

	Long getCount();

	List<TourismEntity> getAll();
}
