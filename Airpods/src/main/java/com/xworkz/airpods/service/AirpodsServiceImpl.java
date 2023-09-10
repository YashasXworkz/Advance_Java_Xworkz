package main.java.com.xworkz.airpods.service;

import java.util.List;

import main.java.com.xworkz.airpods.dto.AirpodsDto;
import main.java.com.xworkz.airpods.repo.AirpodRepoImpl;
import main.java.com.xworkz.airpods.repo.AirpodsRepo;

public class AirpodsServiceImpl implements AirpodsService {
	AirpodsRepo repo = new AirpodRepoImpl();

	public boolean store(AirpodsDto dto) {
		System.out.println("Invoked service store method");
		if (dto != null) {
			if (dto.getPrice() <= 2000) {
				return repo.store(dto);
			}
		}
		return false;
	}

	public boolean updateColorByName(String color, String name) {
		System.out.println("Invoked service updateColorByName method");
		if (color != null && name != null) {
			System.out.println("data for updation is valid");
			return repo.updateColorByName(color, name);
		}
		return false;
	}

	public boolean deleteByPrice(int price) {
		if (price > 2000 && price < 10000) {
			System.out.println("price valid");
			return repo.deleteByPrice(price);
		}
		return false;
	}

	public List<AirpodsDto> readAll() {
		return repo.readAll();
	}
}
