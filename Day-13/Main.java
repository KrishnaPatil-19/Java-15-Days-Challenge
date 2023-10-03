/*Filename : - cwh_104_ex7.java
  Lec 103 was solution to Exercise 6.*/

package com.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class myLibrary{
    public ArrayList<Book> books;
    public myLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issuedTo){
        System.out.println("The book has been issued from the library to " + issuedTo);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("This book has been returned");
        this.books.add(b);
    }
}

public class Main {
    public static void main(String[] args) {
         /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Alchemist", "Paulo Coehlo");
        bk.add(b1);

        Book b2 = new Book("The First World War", "John Keegan");
        bk.add(b2);

        Book b3 = new Book("The Second World War", "Anthony Beevor");
        bk.add(b3);

         myLibrary l = new myLibrary(bk);
        System.out.println(l.books);
        l.issueBook(b3, "Krishna");
        System.out.println(l.books);
    }
}