package com.example.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Map;

@WebService
public class LibraryService {
    private Map<String, Book> books = new HashMap<>();

    @WebMethod
    public String addBook(String isbn, String title, String author) {
        books.put(isbn, new Book(isbn, title, author));
        return "Book added successfully!";
    }

    @WebMethod
    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    @WebMethod
    public String deleteBook(String isbn) {
        if (books.remove(isbn) != null) {
            return "Book deleted successfully!";
        }
        return "Book not found!";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/LibraryService", new LibraryService());
        System.out.println("Service is running at http://localhost:8081/LibraryService?wsdl");
    }
}

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book() {}

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
