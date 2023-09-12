package com.xworkz.book.dto;

import com.xworkz.book.enums.Languages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto implements Comparable<BookDto> {
  private int id;
  private String bookName;
  private int publishedYear;
  private String author;
  private String publisher;
  private double price;
  private int noOfPages;
  private Languages languages;
  
  // Sorts by id method
  @Override
  public int compareTo(BookDto o) {
    return this.id - o.id;
  }
}
