/**
 * 
 */
package com.orange.developheure.library.service.impl;

import java.util.Date;
import java.util.List;

import com.orange.developheure.library.model.Author;
import com.orange.developheure.library.model.Book;
import com.orange.developheure.library.service.AuthorService;
import com.orange.developheure.library.technical.AuthorNotFoundException;

/**
 * @author ahdi7503
 *
 */
public class AuthorServiceImpl implements AuthorService {

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.AuthorService#getBooksFromAuthor(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Book> getBooksFromAuthor(String authorFirstName,
			String authorLastName) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.AuthorService#getAuthor(java.lang.Long)
	 */
	@Override
	public Author getAuthor(Long id) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.AuthorService#getAuthorsByName(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Author> getAuthorsByName(String firstName, String lastName)
			throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orange.developheure.library.service.AuthorService#createAuthor(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date)
	 */
	@Override
	public Long createAuthor(String firstName, String lastName,
			String nationality, Date dateOfBirth, Date dateOfDeath) {
		// TODO Auto-generated method stub
		return null;
	}

}
