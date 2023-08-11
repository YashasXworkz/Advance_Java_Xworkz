package com.xworkz.dominosapp.runner;

import com.xworkz.dominosapp.dto.*;
import com.xworkz.dominosapp.repository.*;
import com.xworkz.dominosapp.service.*;

public class Runner {
  public static void main(String[] args) {
    int size = 1;
    DominosRepository dominosRepository = new DominosRepositoryImpl(size);
    
    DominosDTO dominosDTO = new DominosDTO();
    dominosDTO.setItemName("peppy paneer");
    dominosDTO.setPrice(459.00);
    dominosDTO.setQuantity(2);
    dominosDTO.setItemSize("medium");
    dominosDTO.setDescription("flavorful trio of juicy paneer, crisp capsicum with spicy red paprika");
    dominosDTO.setPaymentMethod("upi");
    dominosDTO.setItemType("veg");
    dominosDTO.setItemAvailable(true);
    dominosDTO.setColdDrinks("coke");
    dominosDTO.setDeliveryPerson("raghu");
    dominosDTO.setDeliveryCharges(49.00);
    dominosDTO.setDoorNumber(10);
    dominosDTO.setAreaName("moodalapalya");
    dominosDTO.setPincode(560072);
    dominosDTO.setRefundAvailable(false);
    
    DominosService dominosService = new DominosServiceImpl();
    boolean validate = dominosService.validateDetails(dominosDTO);
    if (validate) {
      boolean added = dominosRepository.addDominosDetails(dominosDTO);
      System.out.println(added);
      dominosRepository.getAllDetails();
    }
  }
}
