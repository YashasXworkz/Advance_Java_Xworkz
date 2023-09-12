package com.xworkz.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyDto implements Comparable<CurrencyDto> {
  private int id;
  private String country;
  private String currencyName;
  private double length;
  private double width;
  private int yearOfPrint;
  
  @Override
  public int compareTo(CurrencyDto o) {
    return this.id - o.id;
  }
}
