package com.xworkz.book.comparator;

import com.xworkz.book.dto.BookDto;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<BookDto> {
  @Override
  public int compare(BookDto o1, BookDto o2) {
    return (int) o1.getPrice() - (int) o2.getPrice();
  }
}
