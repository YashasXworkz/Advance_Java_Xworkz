package com.xworkz.fuelstation.runner;

import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTester {
  public static void main(String[] args) {
    Map<Integer, FuelStationDto> dtos = new TreeMap<>(); //Sorted form
    dtos.put(4, new FuelStationDto(4, "hpcl fuel station", "hindustan petroleum", "bangalore", "girish", 6));
    dtos.put(3, new FuelStationDto(3, "cng fuel station", "cng corporation", "chandigarh", "govind", 7));
    dtos.put(6, new FuelStationDto(6, "essar fuel station", "essar oil", "kolkata", "adil", 5));
    dtos.put(2, new FuelStationDto(2, "adani fuel station", "adani gas", "pune", "kiran rao", 6));
    dtos.put(1, new FuelStationDto(1, "bp fuel station", "bp india", "delhi", "mukesh", 7));
    dtos.put(5, new FuelStationDto(5, "bharat petroleum fuel station", "bharat petroleum", "jaipur", "robert", 5));
    
    Set<Map.Entry<Integer, FuelStationDto>> fuels = dtos.entrySet();
    /*for (Map.Entry<Integer, FuelStationDto> f : fuels) {
      System.out.println("Key: " + f.getKey() + ", Value: " + f.getValue());
    }*/
    
    Set d =  (Set) dtos.entrySet();
    Iterator<FuelStationDto> itr = d.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
