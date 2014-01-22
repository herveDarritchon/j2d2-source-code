/**
 * 
 */
package com.orange.developheure.library.service.impl;

import java.util.List;

import com.orange.developheure.library.model.Author;
import com.orange.developheure.library.model.Book;
import com.orange.developheure.library.model.BookType;
import com.orange.developheure.library.service.BookService;
import com.orange.developheure.library.technical.BookNotFoundException;

/**
 * @author ahdi7503
 *
 */
public class BookServiceImpl implements BookService {

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.BookService#getBook(java.lang.Long)
	 */
	@Override
	public Book getBook(Long id) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.BookService#getBooksByTitle(java.lang.String)
	 */
	@Override
	public List<Book> getBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.BookService#getAuthorsFromBook(java.lang.String)
	 */
	@Override
	public List<Author> getAuthorsFromBook(String bookTitle)
			throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.BookService#createBook(java.lang.String, com.orange.developheure.library.model.BookType, int, java.lang.Long[])
	 */
	@Override
	public Long createBook(String title, BookType type, int year,
			Long... authorsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
