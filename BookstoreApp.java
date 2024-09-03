/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book.store.app;

/**
 *
 * @author rakwa
 */
  // BookstoreApp.java
public class BookstoreApp {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore(10);

        // Add some books
        bookstore.addBook(new Book("Java for Beginners", "John Doe", "1234567890", 5));
        bookstore.addBook(new Book("Python Crash Course", "Jane Smith", "2345678901", 3));
        bookstore.addBook(new Book("C++ Programming", "Bob Johnson", "3456789012", 2));

        // Search for a book
        bookstore.searchBook("Java");

        // Remove a book
        bookstore.removeBook("2345678901");

        // Generate report
        bookstore.generateReport();
    }

    private static class Book {

        public Book(String java_for_Beginners, String john_Doe, String string, int i) {
        }
    }
}


   