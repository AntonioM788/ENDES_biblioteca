package com.endes.biblioteca;

import java.util.List;

public class Libro {
    private String isbn;
    private String title;
    private List<Autor> autores;
	
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
