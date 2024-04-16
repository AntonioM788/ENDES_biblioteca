package com.endes.biblioteca;

import java.util.List;

/**
 * Representa a un autor de libros dentro de un sistema de gestión de biblioteca.
 * Contiene información personal del autor y una lista de libros que el autor ha escrito. 
 * 
 * @author Antonio 
 * @version 1.0 
 */

public class Autor {
    private String name;
    private String biography;
    private List<Libro> libros;
    
	public String getName() {
		return name;
	}
	
	/**
	 * Esto es para acceder al nombre del autor 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Libro> getLibros() {
		return libros;
	}
	
	/**
	 * Esto es para acceder a la Lista de libros 
	 * @param libros
	 */
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public String getBiography() {
		return biography;
	}
	
	/**
	 * Esto es para acceder a la biografía del autor 
	 * @param biography
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}

    
}
