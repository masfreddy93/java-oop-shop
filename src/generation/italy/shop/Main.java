package generation.italy.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto("Palla", "Gioco per tutte le età", 15);
		
		
		String result = p.toString();
		System.out.println(result);
		
		p.getPrice(); 	//chiamo il metodo getPrice
		
		System.out.println("Prezzo con iva: " + p.getPriceWithIva());
		
	}
}
