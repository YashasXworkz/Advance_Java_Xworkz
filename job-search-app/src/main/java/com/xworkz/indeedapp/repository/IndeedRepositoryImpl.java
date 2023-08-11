package com.xworkz.indeedapp.repository;

import com.xworkz.indeedapp.dto.*;

public class IndeedRepositoryImpl implements IndeedRepository {
  IndeedDTO[] indeedDTO;
  int index;
  
  public IndeedRepositoryImpl(int size) {
    indeedDTO = new IndeedDTO[size];
  }
  
  @Override
  public boolean addJob(IndeedDTO indDTO) {
    boolean isAdded = false;
    if (indDTO != null) {
      indeedDTO[index] = indDTO;
      index++;
      isAdded = true;
    }
    return isAdded;
  }
}
