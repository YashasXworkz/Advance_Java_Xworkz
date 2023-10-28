package com.xworkz.functional.comparator;

import com.xworkz.functional.book.Book;

import java.util.Comparator;

public class BookPublishedYearComparator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    return o1.getPublishedYear() - o2.getPublishedYear();
  }
}
