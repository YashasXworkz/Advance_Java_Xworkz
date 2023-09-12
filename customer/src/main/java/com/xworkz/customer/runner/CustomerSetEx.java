package com.xworkz.customer.runner;

import com.xworkz.customer.dto.CustomerDto;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSetEx {
  public static void main(String[] args) {
    Set<CustomerDto> dtos = new TreeSet<>();
    dtos.add(new CustomerDto(3, "bharath", "bharath@gmail.com", 5234167890L, "bharath@12"));
    dtos.add(new CustomerDto(5, "darshan", "darshan@gmail.com", 7234561890L, "darshan@12"));
    dtos.add(new CustomerDto(1, "yashas", "yashas@gmail.com", 9234567810L, "yashas@12"));
    dtos.add(new CustomerDto(4, "krishna", "krishna@gmail.com", 8234567190L, "krishna@12"));
    dtos.add(new CustomerDto(2, "pavan", "pavan@gmail.com", 6234517890L, "pavan@12"));
    
    Iterator<CustomerDto> itr = dtos.iterator();
    while (itr.hasNext()) {
      CustomerDto dto = itr.next();
      System.out.println(dto);
    }
  }
}
