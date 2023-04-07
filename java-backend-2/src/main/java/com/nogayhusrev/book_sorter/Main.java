package com.nogayhusrev.book_sorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Yabancı", 110, "Albert Camus", 1981);
        Book book2 = new Book("Dorian Gray'in Portresi", 258, "Oscar Wilde", 1890 );
        Book book3 = new Book("Dönüşüm", 74, "Franz Kafka", 1915);
        Book book4 = new Book("Yapay Zeka", 175, "Cem Say", 2018);
        Book book5 = new Book("Outliers", 242, "Malcolm Gladwell", 2008);


        TreeSet<Book> booksSortedByName = new TreeSet<>();

        booksSortedByName.add(book1);
        booksSortedByName.add(book2);
        booksSortedByName.add(book3);
        booksSortedByName.add(book4);
        booksSortedByName.add(book5);


        System.out.println("\nBooks sorted by name: \n");
        System.out.println(booksSortedByName);



        TreeSet<Book> booksSortedByPage = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book book1, Book book2) {
                return book1.getNumOfPage() - book2.getNumOfPage();
            }
        });

        booksSortedByPage.add(book1);
        booksSortedByPage.add(book2);
        booksSortedByPage.add(book3);
        booksSortedByPage.add(book4);
        booksSortedByPage.add(book5);

        System.out.println("\nBooks sorted by page: \n");
        System.out.println(booksSortedByPage);

    }
}
