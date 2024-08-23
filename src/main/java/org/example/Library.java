package org.example;

public class Library {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

   public Library(Book[] books) {
        this.books = books;
   }

   @Override
    public String toString() {
        String bookList = "";
        for (Book book : books) {
            bookList += book.toString() + "\n";
        }
        return "Library: \n" + bookList;
   }

}
