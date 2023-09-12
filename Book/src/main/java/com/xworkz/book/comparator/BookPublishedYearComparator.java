package com.xworkz.book.comparator;

import com.xworkz.book.dto.BookDto;

import java.util.Comparator;

public class BookPublishedYearComparator implements Comparator<BookDto> {
  @Override
  public int compare(BookDto o1, BookDto o2) {
    return o1.getPublishedYear() - o2.getPublishedYear();
  }
}
