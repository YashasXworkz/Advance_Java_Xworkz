package com.xworkz.dominosapp.repository;

import com.xworkz.dominosapp.dto.*;

public interface DominosRepository {
  boolean addDominosDetails(DominosDTO dominosDTO);
  void getAllDetails();
}