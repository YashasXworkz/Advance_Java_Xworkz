package com.xworkz.functional.runner;

import java.util.ArrayList;
import java.util.List;

public class EvenTester {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(6);
    numbers.add(4);
    numbers.add(5);
    numbers.add(2);
    numbers.add(8);
    numbers.add(1);
    numbers.add(7);
    
    //numbers.stream().filter(num -> (num % 2) == 0).forEach(System.out::println);
    //System.out.println(numbers.stream().filter(num -> (num % 2) == 0).mapToInt(Integer::intValue).sum());
    //numbers.stream().filter(num -> (num % 2) == 0).forEach(num -> System.out.println(num));
    
    numbers
        .forEach(num -> System.out.print((num % 2 == 0) ? "Even: " + num + " " : "Odd: " + num + " "));
  }
}

