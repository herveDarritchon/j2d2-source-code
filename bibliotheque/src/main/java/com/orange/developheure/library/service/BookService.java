package com.orange.developheure.library.service;

import java.util.List;

import javax.jws.WebService;

import com.orange.developheure.library.model.Author;
import com.orange.developheure.library.model.Book;
import com.orange.developheure.library.model.BookType;
import com.orange.developheure.library.technical.BookNotFoundException;

@WebService(name="BookService", serviceName="BookService")
public interface BookService {

    Book getBook(Long id) throws BookNotFoundException;

    List<Book> getBooksByTitle(String title);

    List<Author> getAuthorsFromBook(String bookTitle) throws BookNotFoundException;

    Long createBook(String title, BookType type, int year, Long... authorsId);
}

