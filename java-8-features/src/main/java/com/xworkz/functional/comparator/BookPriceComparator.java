package com.xworkz.functional.comparator;

import com.xworkz.functional.book.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    return (int) o1.getPrice() - (int) o2.getPrice();
  }
}
