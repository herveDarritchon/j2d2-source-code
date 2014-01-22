package com.orange.developheure.library.technical;

public class AuthorNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2354998028992378497L;
	private Long id;
	private String author;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	
}
