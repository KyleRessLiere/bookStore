package com.graphqljava.tutorial.bookDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.graphqljava.tutorial.bookDetails.model.Book;
import com.graphqljava.tutorial.bookDetails.repository.BookRepository;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    // Fetch a book by its ID
    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Fetch all books
    @QueryMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
