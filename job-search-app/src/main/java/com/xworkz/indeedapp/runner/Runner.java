package com.xworkz.indeedapp.runner;

import com.xworkz.indeedapp.dto.*;
import com.xworkz.indeedapp.repository.*;
import com.xworkz.indeedapp.service.*;
import lombok.*;

import java.util.*;

@Data
public class Runner {
  public static void main(String[] args) {
    IndeedRepository indRepo = new IndeedRepositoryImpl(1);
    IndeedService indServ = new IndeedServiceImpl(indRepo);
    IndeedDTO indeedDTO = new IndeedDTO(10, "Software Engineer", "Apple", 20000, "Bengaluru", "India", "https://www.apple.com/in/", "You're a leader in sales, product knowledge and solutions.", "Full-Time", "Sales Department", "https://g.co/kgs/CTMQ53", 100000, "Mid-Level", "M-com/B-com", "Sales Management", "Work from home", new Date(), new Date(), 1234567890L, "apple@in.com", 177, "Yashas", 1234567890L, "yashas177@in.com", "yashas@177");
    indServ.validateJobAndAdd(indeedDTO);
  }
}
