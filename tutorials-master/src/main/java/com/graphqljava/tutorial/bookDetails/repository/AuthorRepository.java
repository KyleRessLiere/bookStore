package com.graphqljava.tutorial.bookDetails.repository;

import com.graphqljava.tutorial.bookDetails.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends MongoRepository<Author, String> {
    List<Author> findAll();
    Optional<Author> findById(String id);
}
