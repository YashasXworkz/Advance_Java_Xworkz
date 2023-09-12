package com.xworkz.fuelstation.comparator;

import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.Comparator;

public class FuelStationNameComparator implements Comparator<FuelStationDto> {
  @Override
  public int compare(FuelStationDto o1, FuelStationDto o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
