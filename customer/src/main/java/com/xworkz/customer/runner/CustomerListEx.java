package com.xworkz.customer.runner;

import com.xworkz.customer.comparator.CustomerEmailComparator;
import com.xworkz.customer.comparator.CustomerNameComparator;
import com.xworkz.customer.dto.CustomerDto;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CustomerListEx {
  public static void main(String[] args) {
    List<CustomerDto> dtos = new LinkedList<>();
    dtos.add(new CustomerDto(3, "bharath", "bharath@gmail.com", 5234167890L, "bharath@12"));
    dtos.add(new CustomerDto(5, "darshan", "darshan@gmail.com", 7234561890L, "darshan@12"));
    dtos.add(new CustomerDto(1, "yashas", "yashas@gmail.com", 9234567810L, "yashas@12"));
    dtos.add(new CustomerDto(4, "krishna", "krishna@gmail.com", 8234567190L, "krishna@12"));
    dtos.add(new CustomerDto(2, "pavan", "pavan@gmail.com", 6234517890L, "pavan@12"));
    
    System.out.println("-------------Not Sorted-------------\n");
    for (CustomerDto d : dtos) {
      System.out.println(d);
    }
    
    Collections.sort(dtos);
    System.out.println("-------------Sorted by Id-------------\n");
    //dtos.forEach(d -> System.out.println(d));
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new CustomerNameComparator());
    System.out.println("-------------Sorted by Customer Name-------------\n");
    dtos.forEach(System.out::println);
    
    Collections.sort(dtos, new CustomerEmailComparator());
    System.out.println("-------------Sorted by Customer Email-------------\n");
    Iterator<CustomerDto> itr = dtos.iterator();
    while (itr.hasNext()) {
      CustomerDto dto = itr.next();
      System.out.println(dto);
    }
  }
}
