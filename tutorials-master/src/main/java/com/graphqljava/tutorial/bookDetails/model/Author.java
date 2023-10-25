package com.graphqljava.tutorial.bookDetails.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Document(collection = "author")
public class Author {
    @Id
    private String id;
    
    @Field("firstName")
    private String firstName;
    
    @Field("lastName")
    private String lastName;
    
    private String ssn;

    public Author() {
    }

    public Author(String id, String firstName, String lastName, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
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
    if (Boolean.TRUE.equals(RequestContextHolder.getRequestAttributes().getAttribute("isAdmin", RequestAttributes.SCOPE_REQUEST))) {
        return ssn;
    }
    return null; // Or you can return a masked version of the SSN, or whatever you prefer
}
}
