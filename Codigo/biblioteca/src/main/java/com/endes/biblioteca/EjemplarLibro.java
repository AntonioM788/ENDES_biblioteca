package com.endes.biblioteca;

import java.util.List;

public class EjemplarLibro extends Libro{
	
	private String barcode;
	private String tag;
	
	public EjemplarLibro(String isbn, String title, List<Autor> autores, String summary, String publication_date,
			Integer number_pages, String barcode, String tag) {
		super(isbn, title, autores, summary, publication_date, number_pages);
		this.barcode = barcode;
		this.tag = tag;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
	
	
		
		

}
