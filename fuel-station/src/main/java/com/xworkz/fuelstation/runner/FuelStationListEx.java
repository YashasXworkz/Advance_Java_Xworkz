package com.xworkz.fuelstation.runner;

import com.xworkz.fuelstation.comparator.*;
import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FuelStationListEx {
  public static void main(String[] args) {
    List<FuelStationDto> dtos = new LinkedList<>();
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
    
    Iterator<FuelStationDto> itr = dtos.listIterator();
    System.out.println("---------------Not Sorted---------------\n");
    while (itr.hasNext()) {
      FuelStationDto dto = itr.next();
      System.out.println(dto);
    }
    
    Collections.sort(dtos);
    System.out.println("---------------Sorted by Id---------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new FuelStationNameComparator());
    System.out.println("---------------Sorted by Fuel Name---------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new FuelStationCompanyComparator());
    System.out.println("---------------Sorted by Company Name---------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new FuelStationAddressComparator());
    System.out.println("---------------Sorted by Address---------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new FuelStationOwnerNameComparator());
    System.out.println("---------------Sorted by Owner Name---------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new FuelStationNoOfWorkersComparator());
    System.out.println("---------------Sorted by No of Workers---------------\n");
    dtos.forEach(System.out::println);
  }
}
