package com.xworkz.fuelstation.runner;

import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.Set;
import java.util.TreeSet;

public class FuelStationSetEx {
  public static void main(String[] args) {
    Set<FuelStationDto> dtos = new TreeSet<>();
    dtos.add(new FuelStationDto(8, "gail fuel station", "gail india limited", "ahmedabad", "ahmed", 8));
    dtos.add(new FuelStationDto(1, "indianoil fuel station", "indianoil corporation", "mumbai", "ali", 5));
    dtos.add(new FuelStationDto(6, "shell fuel station", "shell india", "hyderabad", "venu gopal", 7));
    dtos.add(new FuelStationDto(4, "reliance fuel station", "reliance industries", "chennai", "arun", 8));
    dtos.add(new FuelStationDto(2, "bp fuel station", "bp india", "delhi", "mukesh", 7));
    dtos.add(new FuelStationDto(7, "adani fuel station", "adani gas", "pune", "kiran rao", 6));
    dtos.add(new FuelStationDto(10, "cng fuel station", "cng corporation", "chandigarh", "govind", 7));
    dtos.add(new FuelStationDto(3, "hpcl fuel station", "hindustan petroleum", "bangalore", "girish", 6));
    dtos.add(new FuelStationDto(9, "bharat petroleum fuel station", "bharat petroleum", "jaipur", "robert", 5));
    dtos.add(new FuelStationDto(5, "essar fuel station", "essar oil", "kolkata", "adil", 5));
    
    System.out.println("-------------Sorted by id-------------\n");
    dtos.forEach(System.out::println);
  }
}
