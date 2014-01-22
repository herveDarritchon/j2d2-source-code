package com.orange.developheure.library.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.orange.developheure.library.model.Author;
import com.orange.developheure.library.model.Book;
import com.orange.developheure.library.technical.AuthorNotFoundException;

@WebService(name="AuthorService", serviceName="AuthorService")
public interface AuthorService {

    List<Book> getBooksFromAuthor(String authorFirstName, String authorLastName) throws AuthorNotFoundException;

    Author getAuthor(Long id) throws AuthorNotFoundException;

    List<Author> getAuthorsByName(String firstName, String lastName) throws AuthorNotFoundException;

    Long createAuthor(String firstName, String lastName, String nationality, Date dateOfBirth, Date dateOfDeath);
}
