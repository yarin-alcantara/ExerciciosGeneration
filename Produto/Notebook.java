package Produto;

public class Notebook {

	public static void main(String[] args) {
			especificaçõesNotebook[] Notebooks =new especificaçõesNotebook[2];
			
			Notebooks[0] = new especificaçõesNotebook("Lenovo","IdeaPad S145","Prata","Linux","Intel Core i3", 15.6,4,1);
			Notebooks[1] = new especificaçõesNotebook("Lenovo","IdeaPad S145","Preto","Windows 10 Home","Intel Core i5", 15.6,8,1);

			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" Olá, Seja Bem Vindo ");
			System.out.println("\nHoje temos disponiveis esses seguintes Notebook(s): ");
			System.out.println(" ");
			Notebooks[0].ImprimirInfo();
			System.out.println("");
			System.out.println("   ----   ");
			System.out.println("");
			Notebooks[1].ImprimirInfo();
			System.out.println("");
			System.out.println("");
			System.out.println(" ** Espero que tenha interesse em algum!!!! ** ");
			
	
			
	}

}
