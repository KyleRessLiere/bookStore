package com.graphqljava.tutorial.bookDetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.graphqljava.tutorial.bookDetails.model.Book;
import com.graphqljava.tutorial.bookDetails.repository.BookRepository;

@Slf4j
@Component
public class DataInitializer implements ApplicationRunner {

    private final BookRepository bookRepository;

    // Inject the BookRepository bean
    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("Initializing data...");

        // Create a new book and save it
        Book newBook = new Book("book-99", "New Book", 30, "author-4");
        bookRepository.save(newBook);

        log.info("Data initialization complete.");
    }
}
