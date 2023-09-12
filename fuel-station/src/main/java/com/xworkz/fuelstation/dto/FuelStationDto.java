package com.xworkz.fuelstation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelStationDto implements Comparable<FuelStationDto> {
  private int id;
  private String name;
  private String companyName;
  private String address;
  private String ownerName;
  private int noOfWorkers;
  
  @Override
  public int compareTo(FuelStationDto o) {
    return this.id - o.id;
  }
}
