package progettoSettimanaleJava02;

import java.time.LocalDate;

public class Books extends Archivio {
	public String autore;
	public String genere;
	
	public Books (String isbn, String titolo, LocalDate annoPubblicazione, int numPag, String autore, String genere) {
		super(isbn, titolo, annoPubblicazione, numPag); 
			this.autore = autore;
			this.genere = genere;
			
	}
	
	public String getAutore() {
		return autore;
	}
	
	public String getGenere() {
		return genere;
	}

}