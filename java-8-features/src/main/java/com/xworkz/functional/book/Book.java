package com.xworkz.functional.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Comparable<Book> {
  private int id;
  private String bookName;
  private int publishedYear;
  private String author;
  private String publisher;
  private double price;
  private int noOfPages;
  private Languages languages;
  
  @Override
  public int compareTo(Book o) {
    return this.id - o.getId();
  }
}
