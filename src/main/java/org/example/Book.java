package org.example;

public class Book {

    String title;
    String author;
    String isbn;

   public Book(String title, String author, String isbn) {
       this.title = title;
       this.author = author;
       this.isbn = isbn;

   }

   @Override
    public String toString() {
       return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";

   }

   public void setAuthor(String author) {
       this.author = author;
   }

   public void setIsbn(String isbn) {
       this.isbn = isbn;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   public String getTitle() {
       return title;
   }



}
