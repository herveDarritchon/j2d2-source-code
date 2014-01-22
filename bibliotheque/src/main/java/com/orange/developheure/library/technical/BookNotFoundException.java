package com.orange.developheure.library.technical;

public class BookNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8984119695104006082L;
	private Long id;
    private String title;
    
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
    
}
