package com.xworkz.functional.comparator;

import com.xworkz.functional.book.Book;

import java.util.Comparator;

public class BookNumberOfPagesComparator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    return o1.getNoOfPages() - o2.getNoOfPages();
  }
}
