package com.xworkz.currency.runner;

import com.xworkz.currency.comparator.CurrencyCountryComparator;
import com.xworkz.currency.comparator.CurrencyNameComparator;
import com.xworkz.currency.dto.CurrencyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CurrencyListEx {
  public static void main(String[] args) {
    List<CurrencyDto> dtos = new ArrayList<>();
    dtos.add(new CurrencyDto(3, "europe", "euro", 160.0, 72.0, 1999));
    dtos.add(new CurrencyDto(5, "canada", "canadian dollar", 152.0, 68.7, 1935));
    dtos.add(new CurrencyDto(1, "united states", "us dollar", 156.0, 66.3, 1862));
    dtos.add(new CurrencyDto(4, "japan", "japanese yen", 150.0, 76.5, 1871));
    dtos.add(new CurrencyDto(2, "united kingdom", "british pound", 135.0, 77.2, 1694));
    dtos.add(new CurrencyDto(7, "switzerland", "swiss franc", 130.0, 65.5, 1850));
    dtos.add(new CurrencyDto(9, "india", "indian rupee", 157.0, 72.6, 1540));
    dtos.add(new CurrencyDto(8, "china", "chinese yuan", 143.0, 70.2, 1948));
    dtos.add(new CurrencyDto(10, "brazil", "brazilian real", 165.0, 68.9, 1994));
    dtos.add(new CurrencyDto(6, "australia", "australian dollar", 170.0, 74.8, 1966));
    
    Collections.sort(dtos);
    System.out.println("--------------Sorted by Id--------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new CurrencyCountryComparator());
    System.out.println("--------------Sorted by Country--------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new CurrencyNameComparator());
    System.out.println("--------------Sorted by Currency Name--------------\n");
    dtos.forEach(System.out::println);
  }
}
