package progettoSettimanaleJava02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		
		Books book1 = new Books("9788806236152", "Il signore degli anelli", LocalDate.of(1954, 1, 1), 1178, "J.R.R. Tolkien", "Fantasy");
		Books book2 = new Books("9788804677249", "1984", LocalDate.of(1949, 1, 1), 328, "George Orwell", "Distopia");
		Books book3 = new Books("9788804668230", "Orgoglio e pregiudizio", LocalDate.of(1813, 1, 1), 432, "Jane Austen", "Romanzo");
		Books book4 = new Books("9788804685336", "Il nome della rosa", LocalDate.of(1980, 1, 1), 512, "Umberto Eco", "Mistero");
		Riviste rivista1 = new Riviste("9788850339002", "National Geographic", LocalDate.of(1888, 2, 4), 150, Periodicità.MENSILE);
		Riviste rivista2 = new Riviste("9788834181353", "Time", LocalDate.of(1923, 3, 3), 100, Periodicità.SETTIMANALE);
		Riviste rivista3 = new Riviste("9788865262637", "Wired", LocalDate.of(1993, 5, 5), 120, Periodicità.MENSILE);
		Riviste rivista4 = new Riviste("9788887778135", "Vanity Fair", LocalDate.of(1983, 7, 9), 80, Periodicità.MENSILE);
		
		 	catalogo.addItem(book1);
	        catalogo.addItem(book2);
	        catalogo.addItem(book3);
	        catalogo.addItem(book4);
	        catalogo.addItem(rivista1);
	        catalogo.addItem(rivista2);
	        catalogo.addItem(rivista3);
	        catalogo.addItem(rivista4);
	        
	        catalogo.removeItem("9788834181353");
	        System.out.println("L'elemento è stato rimosso dall'archivio");
	        
	        Optional<Archivio> foundByIsbn = catalogo.findByIsbn("9788806236152");
	        foundByIsbn.ifPresent(item -> System.out.println("Ricerca per ISBN: " + item.getTitle()));
	        
	        
	        List<Archivio> foundByYear = catalogo.findByYear(LocalDate.of(1949, 1, 1));
	        for (Archivio item : foundByYear) {
	            System.out.println("Ricerca per Anno di pubblicazione: " + item.getAnnoPubblicazione() +" "+ "Titolo: " + item.getTitle());
	        }
	
	
	        List<Archivio> foundByAuthor = catalogo.findByAuthor("Jane Austen");
	        System.out.println("Ricerca per autore 'Jane Austen':");
	        for (Archivio item : foundByAuthor) {
	            System.out.println(item.getTitle());
	            
	                
	            
	        }  
    
	}


}
