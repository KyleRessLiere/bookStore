package com.graphqljava.tutorial.bookDetails.repository;

import com.graphqljava.tutorial.bookDetails.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
    // Define custom queries or methods if needed
}
