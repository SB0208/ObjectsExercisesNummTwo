package org.example;

public class Main {
    public static void main(String[] args) {

        Book[] books = {new Book("aaa","bbb","ccc"),new Book("ddd","eee","iii")};
        Library lib = new Library(books);
        System.out.println(lib);
    }
}