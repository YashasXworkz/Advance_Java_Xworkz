package com.xworkz.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Comparable<CustomerDto> {
  private int id;
  private String customerName;
  private String customerEmail;
  private long customerPhone;
  private String password;
  
  @Override
  public int compareTo(CustomerDto o) {
    return this.id - o.id;
  }
}
