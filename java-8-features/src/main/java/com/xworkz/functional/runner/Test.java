package com.xworkz.functional.runner;

public class Test {
  public static void main(String[] args) {
    int uniqueNumber = 0;
    for (int i = 0; i < 20; i++) {
      String referenceNumber = "KA2023RTO" + uniqueNumber++;
      System.out.println(referenceNumber);
    }
  }
}
