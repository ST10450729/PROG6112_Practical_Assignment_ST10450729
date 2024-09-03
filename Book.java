/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author rakwa
 */
public class Book {
    
    // Book.java
    private String title;
    private String author;
    private String isbn;
    private int quantity;

    public Book(String title, String author, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}

// Bookstore.java
public class Bookstore {
    private final Book[] books;
    private int numBooks;

    public Bookstore(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Bookstore is full!");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                // Shift books to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void searchBook(String title) {
        boolean found = false;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().contains(title)) {
                System.out.println(books[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void generateReport() {
        System.out.println("Bookstore Report:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].toString());
        }
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int getCapacity() {
        return books.length;
    }
}

    
