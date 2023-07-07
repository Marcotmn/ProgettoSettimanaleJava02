package progettoSettimanaleJava02;

import java.time.LocalDate;

public class Riviste extends Archivio {
	private Periodicità periodicità;
	
	public Riviste (String isbn, String titolo, LocalDate annoPubblicazione, int numPag, Periodicità periodicità) {
		super(isbn, titolo, annoPubblicazione, numPag); 
			this.periodicità = periodicità;
	
	}
	
	public Periodicità getPeriodicità() {
		return periodicità;
	}
	

}
