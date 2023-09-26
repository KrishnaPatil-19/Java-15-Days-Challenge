package com.company;

class Library
{
        String[] books;
        int no_of_books = 0;
    Library()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks()
    {
        System.out.println("Available books are : ");
        for (String book: this.books) {
            if(book == null)
            {
                continue;
            }
            System.out.println("* "  + book);
        }

    }

    void issueBook(String book){
        for (int i =0; i<this.books.length; i++) {
            if(this.books[i].equals(book))
            {
                System.out.println("The book has been issued.");
                this.books[i] = null;
                return;
            }
            System.out.println("* "  + book);
        }
        System.out.println("This book doesn't exist.");
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}

public class cwh_51_exercise4 {
    public static void main(String[] args) {
//        You have to implement a library using Java Class "Library"
//        Methods: issueBook, returnBook
//        Properties: Array to store the available books
//        Array to store the issued books //As array's size can't be increased, create an array of max size

        Library centralLibrary = new Library();
        centralLibrary.addBook("The Alchemist");
        centralLibrary.addBook("1984");
        centralLibrary.addBook("The Man in the High Castle");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("The Alchemist");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("The Alchemist");
        centralLibrary.showAvailableBooks();
    }
}
