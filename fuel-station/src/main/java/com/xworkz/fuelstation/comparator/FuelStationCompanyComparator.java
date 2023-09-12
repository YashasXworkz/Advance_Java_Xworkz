package com.xworkz.fuelstation.comparator;

import com.xworkz.fuelstation.dto.FuelStationDto;

import java.util.Comparator;

public class FuelStationCompanyComparator implements Comparator<FuelStationDto> {
  @Override
  public int compare(FuelStationDto o1, FuelStationDto o2) {
    return o1.getCompanyName().compareTo(o2.getCompanyName());
  }
}
