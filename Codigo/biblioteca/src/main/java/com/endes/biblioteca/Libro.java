package com.endes.biblioteca;

import java.util.List;

public abstract class Libro {
    private String isbn;
    private String title;
    private List<Autor> autores;
    private String summary;
    private String publication_date;
    Integer number_pages;
    
    public Libro(String isbn, String title, List<Autor> autores, String summary, String publication_date,
			Integer number_pages) {
		this.isbn = isbn;
		this.title = title;
		this.autores = autores;
		this.summary = summary;
		this.publication_date = publication_date;
		this.number_pages = number_pages;
	}
    
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

    // Constructor, getters y setters aquí
}
