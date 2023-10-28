package com.xworkz.functional.runner;

import com.xworkz.functional.book.Book;
import com.xworkz.functional.book.Languages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookRunner {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book(3, "your time will come", 2022, "umakanthan saranya", "prakash books", 129.70, 248, Languages.ENGLISH));
    books.add(new Book(7, "abdul kalam - a life", 2016, "arun tiwari", "manjul", 457.78, 548, Languages.TAMIL));
    books.add(new Book(1, "mookajjiya kanasugalu", 2015, "shivarama karanth", "sapna book house", 250.50, 272, Languages.KANNADA));
    books.add(new Book(9, "oka yogi atmakatha", 2021, "paramhamsayogananda", "yogoda satsanga society of india", 209.88, 628, Languages.TELUGU));
    books.add(new Book(2, "malegalalli madumagalu", 2011, "kuvempu", "udayaravi prakashana", 499.60, 712, Languages.KANNADA));
    books.add(new Book(5, "delhi", 2012, "khushwant singh", "kitabghar prakashan", 350.40, 1500, Languages.HINDI));
    books.add(new Book(4, "you can", 2020, "adams george matthew", "prakash books", 98.10, 232, Languages.ENGLISH));
    books.add(new Book(6, "aag aur paani", 2023, "mitra raghuvir sharan", "diamond books", 255.55, 258, Languages.HINDI));
    books.add(new Book(10, "saptabhumi", 2020, "bandi narayanaswamy", "anvikshiki publishers", 250.90, 250, Languages.TELUGU));
    books.add(new Book(8, "avamanam", 2020, "ramanujam", "bharathi puthakalayam", 100.20, 98, Languages.TAMIL));
    
    //books.stream().forEach(System.out::println);
    //filter method parameter is predicate
    
    /*books.stream().
        filter(book -> book.getPublishedYear() > 2020).
        forEach(System.out::println);*/
    
    /*books.stream().
        filter(book -> book.getPrice() > 350.00).
        forEach(System.out::println);*/
    
    /*books.stream().
        filter(book -> book.getPublisher().equalsIgnoreCase("sapna book house")).
        forEach(System.out::println);*/
    
    /*books.stream().
        filter(book -> book.getPrice() == 98.10).
        forEach(System.out::println);*/
    
    System.out.println("Sorted by id");
    books.stream().sorted().forEach(System.out::println);
    System.out.println("Sorted by book name");
    books.stream().sorted(Comparator.comparing(Book::getBookName)).forEach(System.out::println);
    
    System.out.println("Sorted by price");
    books.stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
    
    System.out.println("Sorted by author");
    books.stream().sorted(Comparator.comparing(Book::getAuthor)).forEach(System.out::println);
  }
}
