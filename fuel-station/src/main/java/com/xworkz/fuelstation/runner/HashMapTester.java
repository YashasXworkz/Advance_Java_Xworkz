package com.xworkz.fuelstation.runner;

import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMapTester {
  public static void main(String[] args) {
    //ConcurrentHashMap<Integer, FuelStationDto> fuel = new ConcurrentHashMap<>();
    Map<Integer, FuelStationDto> fuel = new HashMap<>();//Sorted form
    
    fuel.put(2, new FuelStationDto(2, "indianoil fuel station", "indianoil corporation", "mumbai", "ali", 5));
    fuel.put(1, new FuelStationDto(1, "gail fuel station", "gail india limited", "ahmedabad", "ahmed", 8));
    fuel.put(3, new FuelStationDto(3, "bp fuel station", "bp india", "delhi", "mukesh", 7));
    
    //System.out.println(fuel.get(1)); //Retrieves Single Data
    
    Set<Map.Entry<Integer, FuelStationDto>> entries = fuel.entrySet();
    for (Map.Entry<Integer, FuelStationDto> fuels : entries) {
      System.out.println("Key: " + fuels.getKey() + ", Value: " + fuels.getValue());
    }
    
    /*entries.forEach(entry -> {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    });*/
    
    Set entrySet = (Set) fuel.entrySet();
    Iterator itr = entries.iterator();
    while (itr.hasNext()) {
      Map.Entry<Integer, FuelStationDto> f = (Map.Entry<Integer, FuelStationDto>) itr.next();
      System.out.println("Key: " + f.getKey() + ", Value: " + f.getValue());
    }
  }
}
