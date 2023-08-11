package com.xworkz.dominosapp.service;

import com.xworkz.dominosapp.dto.*;

public class DominosServiceImpl implements DominosService {
  @Override
  public boolean validateDetails(DominosDTO dominosDTO) {
    boolean itemNameVerify = false;
    boolean priceVerify = false;
    boolean qtyVerify = false;
    boolean itemSizeVerify = false;
    boolean descVerify = false;
    boolean paymentVerify = false;
    boolean itemTypeVerify = false;
    boolean itemAvailableVerify = false;
    boolean deliveryPersonVerify = false;
    boolean deliveryChargesVerify = false;
    boolean doorNumVerify = false;
    boolean areaNameVerify = false;
    boolean pincodeVerify = false;
    boolean coldDrinksVerify = false;
    
    boolean allVerified = false;
    if (dominosDTO != null) {
      if (dominosDTO.getItemName() != null && !dominosDTO.getItemName().isEmpty()) {
        System.out.println("verified item name");
        itemNameVerify = true;
      } else {
        System.out.println("invalid item name");
      }
      
      if (dominosDTO.getPrice() > 0) {
        System.out.println("verified price");
        priceVerify = true;
      } else {
        System.out.println("invalid price");
      }
      
      if (dominosDTO.getQuantity() > 0) {
        System.out.println("verified quantity");
        qtyVerify = true;
      } else {
        System.out.println("invalid quantity");
      }
      
      if (dominosDTO.getItemSize() != null && !dominosDTO.getItemSize().isEmpty()) {
        System.out.println("verified item size");
        itemSizeVerify = true;
      } else {
        System.out.println("invalid item size");
      }
      
      if (dominosDTO.getDescription() != null && !dominosDTO.getDescription().isEmpty()) {
        System.out.println("verified description");
        descVerify = true;
      } else {
        System.out.println("invalid description");
      }
      
      if (dominosDTO.getPaymentMethod() != null && !dominosDTO.getPaymentMethod().isEmpty()) {
        System.out.println("verified payment method");
        paymentVerify = true;
      } else {
        System.out.println("invalid payment method");
      }
      
      if (dominosDTO.getItemType() != null && !dominosDTO.getItemType().isEmpty()) {
        System.out.println("verified item type");
        itemTypeVerify = true;
      } else {
        System.out.println("invalid item type");
      }
      
      if (dominosDTO.isItemAvailable()) {
        System.out.println("verified item available");
        itemAvailableVerify = true;
      } else {
        System.out.println("item not available");
      }
      
      if (dominosDTO.getDeliveryPerson() != null && !dominosDTO.getDeliveryPerson().isEmpty()) {
        System.out.println("verified delivery person");
        deliveryPersonVerify = true;
      } else {
        System.out.println("invalid delivery person");
      }
      
      if (dominosDTO.getDeliveryCharges() >= 0) {
        System.out.println("verified delivery charges");
        deliveryChargesVerify = true;
      } else {
        System.out.println("invalid delivery charges");
      }
      
      if (dominosDTO.getDoorNumber() > 0) {
        System.out.println("verified door number");
        doorNumVerify = true;
      } else {
        System.out.println("invalid door number");
      }
      
      if (dominosDTO.getAreaName() != null && !dominosDTO.getAreaName().isEmpty()) {
        System.out.println("verified area name");
        areaNameVerify = true;
      } else {
        System.out.println("invalid area name");
      }
      
      if (dominosDTO.getPincode() > 0) {
        System.out.println("verified pincode");
        pincodeVerify = true;
      } else {
        System.out.println("invalid pincode");
      }
      
      if (dominosDTO.getColdDrinks() != null && !dominosDTO.getColdDrinks().isEmpty()) {
        System.out.println("verified cold drinks");
        coldDrinksVerify = true;
      } else {
        System.out.println("invalid cold drinks");
      }
      
      if (!dominosDTO.isRefundAvailable()) {
        System.out.println("verified refund available");
      }
      
      allVerified = itemNameVerify && priceVerify && qtyVerify && itemSizeVerify && descVerify && paymentVerify && itemTypeVerify && itemAvailableVerify && deliveryPersonVerify && deliveryChargesVerify && doorNumVerify && areaNameVerify && pincodeVerify;
      if (allVerified) {
        System.out.println("verified all");
      } else {
        System.out.println("one of the condition is not verified can't add");
      }
    }
    return allVerified;
  }
}
