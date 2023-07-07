package progettoSettimanaleJava02;

import java.time.LocalDate;

abstract class Archivio {
	
	private  String isbn;
	private  String titolo;
	private  LocalDate annoPubblicazione;
	private  int numPag;
	
	public Archivio (String isbn, String titolo, LocalDate annoPubblicazione, int numPag) {
	
		this.isbn = isbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPag = numPag;
		
	}
	
	
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return titolo;
	}
	
	public LocalDate getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	public int getNumPag() {
		return numPag;
	}
	
	

}