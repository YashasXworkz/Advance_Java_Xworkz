package main.java.com.xworkz.airpods.test;

import java.util.List;

import main.java.com.xworkz.airpods.dto.AirpodsDto;
import main.java.com.xworkz.airpods.service.AirpodsService;
import main.java.com.xworkz.airpods.service.AirpodsServiceImpl;

public class AirpodsTester {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		AirpodsDto dto = new AirpodsDto("OnePlus", 5000, "white", 15);
		System.out.println(dto);
		AirpodsService service = new AirpodsServiceImpl();

		service.store(dto);

		service.updateColorByName("black", "OnePlus");

		service.deleteByPrice(5000);

		List<AirpodsDto> results = service.readAll();
		System.out.println(results);
	}
}
