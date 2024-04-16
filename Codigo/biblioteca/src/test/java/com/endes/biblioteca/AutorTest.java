package com.endes.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class AutorTest {
    
	private Autor autor;
	private List<Libro> libros;
	
	
	@BeforeEach
    public void SetUp() {
		autor = new Autor("Gabriel García Márquez", "Escritor colimbiano, premio Nobel de Literatura en 1982.")
		
		libros = new ArrayList<>();
		libros.add(new EjemplarLibro("Cien años de soledad"));
		libros.add(new EjemplarLibro("El amor en los tiempos del cólera"));
		autor.setLibros(libros);
		
	}
	
	
	@Test
	@DisplayName ("Obtener nombre del autor")
	public void testGetBiografia() {
		assertEquals("Escritor colombiano, premio Nobel de Literatura en 1982", autor.getBiography());
	}
	
	@Test
	@DisplayName("Obtener libros escritos del autor")
	public void testGetLibrosEscritos() {
		assertNotNull(autor.getLibrosEscritos());
		assertEquals(2, autor.getLibrosEscritos().size());
		assertEquals("Cien años de soledad", autor.getLibrosEscritos().get(0).getTitulo());
		assertEquals("El amor en los tiempos del cólera", autor.getLibrosEscritos().get(1).getTitulo());
		
	}
	
	@Test
	@DisplayName("Establecer nombre del autor")
	public void testSetNombre() {
	}
}
