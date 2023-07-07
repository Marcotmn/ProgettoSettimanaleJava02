package progettoSettimanaleJava02;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Catalogo {
	private List<Archivio> items;
	
	public Catalogo() {
		items = new ArrayList<>();
	}
	
	public void addItem(Archivio item) {
		items.add(item);
	}
	
	public void removeItem(String isbn) {
		items.removeIf(item -> item.getIsbn().equals(isbn));
	}
	
	public Optional<Archivio> findByIsbn(String isbn) {
		return items.stream().filter(item -> item.getIsbn().equals(isbn)).findFirst();
	}
	
	public List<Archivio> findByYear(LocalDate annoPubblicazione) {
		return items.stream().filter(item -> item.getAnnoPubblicazione().getYear() == annoPubblicazione.getYear()).toList();
	}
	
	public List<Archivio> findByAuthor(String autore) {
		return items.stream().filter(item -> item instanceof Books).filter(item -> ((Books) item).getAutore().equals(autore)).toList();
	
	}
	
	
    }
