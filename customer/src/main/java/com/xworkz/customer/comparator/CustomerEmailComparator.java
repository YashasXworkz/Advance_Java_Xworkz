package com.xworkz.customer.comparator;

import com.xworkz.customer.dto.CustomerDto;

import java.util.Comparator;

public class CustomerEmailComparator implements Comparator<CustomerDto> {
  @Override
  public int compare(CustomerDto o1, CustomerDto o2) {
    return o1.getCustomerEmail().compareTo(o2.getCustomerEmail());
  }
}
