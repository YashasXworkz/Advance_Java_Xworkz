package com.xworkz.functional.runner;

import java.util.function.BiConsumer;

public class FunctionalProgrammingTester {
  public static void main(String[] args) {
    // -> Lambda Expression
    // Any Interface if it contains only one abstract method called as Functional Programming Language
    /*Addition addTwoNumbers = (first, second) -> {
      System.out.println(first + second);
    };
    addTwoNumbers.add(23, 50);*/
    
    BiConsumer biConsumer = (first, second) -> {
      System.out.println((Integer) first + (Integer) second);
    };
    biConsumer.accept(23, 78);
  }
  
  //Stream is an api that will process bulk data
}
