package com.xworkz.currency.comparator;

import com.xworkz.currency.dto.CurrencyDto;

import java.util.Comparator;

public class CurrencyNameComparator implements Comparator<CurrencyDto> {
  
  @Override
  public int compare(CurrencyDto o1, CurrencyDto o2) {
    return o1.getCurrencyName().compareTo(o2.getCurrencyName());
  }
}
