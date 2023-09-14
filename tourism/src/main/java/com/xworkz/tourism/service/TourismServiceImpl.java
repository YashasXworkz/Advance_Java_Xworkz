package com.xworkz.tourism.service;

import java.util.List;

import com.xworkz.tourism.dto.TourismDTO;
import com.xworkz.tourism.entity.TourismEntity;
import com.xworkz.tourism.repo.TourismRepo;
import com.xworkz.tourism.repo.TourismRepoImpl;

public class TourismServiceImpl implements TourismService {
	TourismRepo repo = new TourismRepoImpl();

	@Override
	public boolean validateAndSave(TourismDTO dto) {
		System.out.println("Invoked validateAndSave method");
		if (dto != null) {
			repo.onSave(dto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Long getCount() {
		return repo.getCount();
	}

	@Override
	public List<TourismEntity> getAll() {
		return repo.getAll();
	}
}
