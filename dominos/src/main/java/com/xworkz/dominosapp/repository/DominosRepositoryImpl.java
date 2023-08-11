package com.xworkz.dominosapp.repository;

import com.xworkz.dominosapp.dto.*;

public class DominosRepositoryImpl implements DominosRepository {
  DominosDTO[] dominosDTO;
  int index;
  
  public DominosRepositoryImpl(int size) {
    dominosDTO = new DominosDTO[size];
  }
  
  @Override
  public boolean addDominosDetails(DominosDTO ddto) {
    boolean isAdded = false;
    dominosDTO[index++] = ddto;
    isAdded = true;
    return isAdded;
  }
  
  @Override
  public void getAllDetails() {
    for (DominosDTO d : dominosDTO) {
      System.out.println(d);
    }
  }
}
