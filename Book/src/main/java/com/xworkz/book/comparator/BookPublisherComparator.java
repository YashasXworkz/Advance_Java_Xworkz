package com.xworkz.book.comparator;

import com.xworkz.book.dto.BookDto;

import java.util.Comparator;

public class BookPublisherComparator implements Comparator<BookDto> {
  @Override
  public int compare(BookDto o1, BookDto o2) {
    return o1.getPublisher().compareTo(o2.getPublisher());
  }
}
