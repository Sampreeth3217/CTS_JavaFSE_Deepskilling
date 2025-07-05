package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        if (bookRepository != null) {
            bookRepository.save();
            System.out.println("BookService: Book added successfully.");
        } else {
            System.out.println("BookService: Dependency not injected!");
        }
    }
}
