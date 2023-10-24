package com.graphqljava.tutorial.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Author {
    private String id;
    private String firstName;
    private String lastName;
    private String ssn;

    public Author(String id, String firstName, String lastName, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling", "123-45-6789"),
            new Author("author-2", "Herman", "Melville", "987-65-4321"),
            new Author("author-3", "Anne", "Rice", "111-22-3333")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
}
