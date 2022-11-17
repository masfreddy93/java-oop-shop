package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	
	Random r = new Random();
	
	public Prodotto(String nome, String descrizione, int prezzo) {
		
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.codice = Math.abs(r.nextInt(10000, 99999));
		this.iva = 20;
	}
	
	void getPrice() {
		
		System.out.println("Prezzo: " + prezzo);
	}
	float getPriceWithIva(){
		
		float priceWithIva = prezzo + (prezzo / 5f);
		return priceWithIva;
	}
	
	
	@Override
	public String toString() {
		
		return "Codice: " + codice +
				"\nNome: " + nome +
				"\nDescrizione: " + descrizione +
				"\nIva: " + iva;
	}
}
