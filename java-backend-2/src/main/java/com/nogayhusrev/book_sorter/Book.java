package com.nogayhusrev.book_sorter;

public class Book implements Comparable<Book>{

    private String name;
    private  int numOfPage;
    private  String authorName;
    private int publicationYear;

    public Book(String name, int numOfPage, String authorName, int publicationYear) {
        this.name = name;
        this.numOfPage = numOfPage;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }


    @Override
    public String toString() {
        return "\nName ='" + name + '\'' +
                "\nPage =" + numOfPage +
                "\nAuthor ='" + authorName + '\'' +
                "\nYear =" + publicationYear +
                "\n***********************************";
    }
}
