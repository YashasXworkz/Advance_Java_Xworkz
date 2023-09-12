package com.xworkz.book.runner;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.enums.Languages;

import java.util.Set;
import java.util.TreeSet;

public class BookSetEx {
  public static void main(String[] args) {
    Set<BookDto> dtos = new TreeSet<>();
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
    
    for (BookDto dto : dtos) {
      System.out.println(dto);
    }
  }
}
