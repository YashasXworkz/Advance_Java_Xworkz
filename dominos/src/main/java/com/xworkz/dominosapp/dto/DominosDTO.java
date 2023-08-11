package com.xworkz.dominosapp.dto;

import lombok.*;

@Data
public class DominosDTO {
  private String itemName;
  private double price;
  private int quantity;
  private String itemSize;
  private String description;
  private String paymentMethod;
  private String itemType;
  private boolean isItemAvailable;
  private String coldDrinks;
  private String deliveryPerson;
  private double deliveryCharges;
  private int doorNumber;
  private String areaName;
  private int pincode;
  private boolean isRefundAvailable;
}
