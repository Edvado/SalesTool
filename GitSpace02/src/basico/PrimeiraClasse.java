package basico;

public class PrimeiraClasse {

	public static void main(String[] args) {
    SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("OI PESSOAL TUDO BOM ");
		System.out.println("ESTA APLICAÇÃO MOSTRA OS DADOS DOS SALERS");
	}

}