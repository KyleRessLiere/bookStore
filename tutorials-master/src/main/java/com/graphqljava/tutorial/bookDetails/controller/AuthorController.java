package com.graphqljava.tutorial.bookDetails.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphqljava.tutorial.bookDetails.model.Author;

import java.util.List;

@Controller
public class AuthorController {

    @QueryMapping
    public List<Author> allAuthors() {
        return Author.getAllAuthors();
    }
}
