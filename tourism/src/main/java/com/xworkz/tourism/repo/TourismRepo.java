package com.xworkz.tourism.repo;

import java.util.List;

import com.xworkz.tourism.dto.TourismDTO;
import com.xworkz.tourism.entity.TourismEntity;

public interface TourismRepo {
	boolean onSave(TourismDTO dto);

	Long getCount();

	List<TourismEntity> getAll();

}
