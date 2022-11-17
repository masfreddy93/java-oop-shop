package generation.italy.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto("Palla", "Gioco per tutte le età", 20);
		
		
		String result = p.toString();
		System.out.println(result);
		
		p.getPrice(); 	//chiamo il metodo getPrice
		System.out.printf("Prezzo con iva: %.2f", p.getPriceWithIva());
		
	}
}
