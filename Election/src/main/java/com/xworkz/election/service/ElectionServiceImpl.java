package com.xworkz.election.service;

import java.util.List;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.repo.ElectionRepoImpl;

public class ElectionServiceImpl implements ElectionService {
	ElectionRepoImpl repo = new ElectionRepoImpl();

	@Override
	public boolean save(ElectionDto dto) {
		System.out.println("Invoked save service method");
		if (dto != null) {
			if (!(dto.getName().length() == 0)) {
				if (dto.getPincode() >= 6) {
					return repo.save(dto);
				}
			}
		}
		return false;
	}

	@Override
	public List<ElectionDto> readAll() {
		System.out.println("Invoked readAll service method");
		return repo.readAll();
	}
}
