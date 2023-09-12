package com.xworkz.book.runner;

import com.xworkz.book.comparator.*;
import com.xworkz.book.dto.BookDto;
import com.xworkz.book.enums.Languages;

import java.util.*;

public class BookListEx {
  public static void main(String[] args) {
    List<BookDto> dtos = new ArrayList<>();
    dtos.add(new BookDto(3, "your time will come", 2022, "umakanthan saranya", "prakash books", 129.70, 248, Languages.ENGLISH));
    dtos.add(new BookDto(7, "abdul kalam - a life", 2016, "arun tiwari", "manjul", 457.78, 548, Languages.TAMIL));
    dtos.add(new BookDto(1, "mookajjiya kanasugalu", 2015, "shivarama karanth", "sapna book house", 250.50, 272, Languages.KANNADA));
    dtos.add(new BookDto(9, "oka yogi atmakatha", 2021, "paramhamsayogananda", "yogoda satsanga society of india", 209.88, 628, Languages.TELUGU));
    dtos.add(new BookDto(2, "malegalalli madumagalu", 2011, "kuvempu", "udayaravi prakashana", 499.60, 712, Languages.KANNADA));
    dtos.add(new BookDto(5, "delhi", 2012, "khushwant singh", "kitabghar prakashan", 350.40, 1500, Languages.HINDI));
    dtos.add(new BookDto(4, "you can", 2020, "adams george matthew", "prakash books", 98.10, 232, Languages.ENGLISH));
    dtos.add(new BookDto(6, "aag aur paani", 2023, "mitra raghuvir sharan", "diamond books", 255.55, 258, Languages.HINDI));
    dtos.add(new BookDto(10, "saptabhumi", 2020, "bandi narayanaswamy", "anvikshiki publishers", 250.90, 250, Languages.TELUGU));
    dtos.add(new BookDto(8, "avamanam", 2020, "ramanujam", "bharathi puthakalayam", 100.20, 98, Languages.TAMIL));
    
    Iterator<BookDto> itr1 = dtos.iterator();
    System.out.println("-------------Not Sorted-------------\n");
    while (itr1.hasNext()) {
      System.out.println(itr1.next());
    }
    
    Collections.sort(dtos);
    Iterator<BookDto> itr2 = dtos.iterator();
    System.out.println("-------------Sorted by Id-------------\n");
    while (itr2.hasNext()) {
      System.out.println(itr2.next());
    }
    
    Collections.sort(dtos, new BookNameComparator());
    Iterator<BookDto> itr3 = dtos.iterator();
    System.out.println("-------------Sorted by Book Name-------------\n");
    while (itr3.hasNext()) {
      System.out.println(itr3.next());
    }
    
    Collections.sort(dtos, new BookPublishedYearComparator());
    Iterator<BookDto> itr4 = dtos.iterator();
    System.out.println("-------------Sorted by Published Year-------------\n");
    while (itr4.hasNext()) {
      System.out.println(itr4.next());
    }
    
    Collections.sort(dtos, new BookAuthorComparator());
    Iterator<BookDto> itr5 = dtos.iterator();
    System.out.println("-------------Sorted by Author-------------\n");
    while (itr5.hasNext()) {
      System.out.println(itr5.next());
    }
    
    Collections.sort(dtos, new BookPublisherComparator());
    Iterator<BookDto> itr6 = dtos.iterator();
    System.out.println("-------------Sorted by Publisher-------------\n");
    while (itr6.hasNext()) {
      System.out.println(itr6.next());
    }
    
    Collections.sort(dtos, new BookPriceComparator());
    Iterator<BookDto> itr7 = dtos.iterator();
    System.out.println("-------------Sorted by Price-------------\n");
    while (itr7.hasNext()) {
      System.out.println(itr7.next());
    }
    
    Collections.sort(dtos, new BookNumberOfPagesComparator());
    Iterator<BookDto> itr8 = dtos.iterator();
    System.out.println("-------------Sorted by Number of Pages-------------\n");
    while (itr8.hasNext()) {
      System.out.println(itr8.next());
    }
    
    Collections.sort(dtos, new BookLanguageComparator());
    Iterator<BookDto> itr9 = dtos.iterator();
    System.out.println("-------------Sorted by Language-------------\n");
    while (itr9.hasNext()) {
      System.out.println(itr9.next());
    }
  }
}
