package com.graphqljava.tutorial.bookDetails.controller;

import com.graphqljava.tutorial.bookDetails.model.Author;
import com.graphqljava.tutorial.bookDetails.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }
}
