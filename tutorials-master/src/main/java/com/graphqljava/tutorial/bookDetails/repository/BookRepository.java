package com.graphqljava.tutorial.bookDetails.repository;

import com.graphqljava.tutorial.bookDetails.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    // Define custom queries or methods if needed
}
