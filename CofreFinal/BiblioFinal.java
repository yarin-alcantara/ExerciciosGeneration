package CofreFinal;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BiblioFinal {
public static void main(String args[]) throws InterruptedException {
		
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro1 = new Livro(1, "Bren� Brown",3,"A coragem de ser imperfeito");
		Livro livro2 = new Livro(2, "Hal Elrod",3,"O milagre da manh�: O segredo para transformar sua vida");
		Livro livro3 = new Livro(3, "Carol S. Dweck",3,"Mindset: A nova psicologia do sucesso");
		Livro livro4 = new Livro(4, "George S. Clason",3,"O homem mais rico da Babil�nia");
		Livro livro5 = new Livro(5, "George S. Clason",3,"O homem mais rico da Babil�nia");
		Livro livro6 = new Livro(6, "Lu�sa Marilac/Nana Queiroz",1,"Eu, travesti: Mem�rias de Lu�sa Marilac");
		Livro livro7 = new Livro(7, "Pedro Henrique Mendes Castilho",1,"Um livro para ser entendido");
		Livro livro8 = new Livro(8, "Jo�o Silv�rio Trevisan",1,"Devassos no Para�so: A homossexualidade no Brasil, da col�nia � atualidade ");
		Livro livro9 = new Livro(9, "Lu�sa Marilac/Nana Queiroz",1,"Eu, travesti: Mem�rias de Lu�sa Marilac");
		Livro livro10 = new Livro(10, "Lu�sa Marilac/Nana Queiroz",1,"Eu, travesti: Mem�rias de Lu�sa Marilac");
		Livro livro11 = new Livro(11, "Djamila Ribeiro",4,"Pequeno manual antirracista");
		Livro livro12 = new Livro(12, "Bell Hooks",4,"O feminismo � para todo mundo: Pol�ticas arrebatadoras");
		Livro livro13 = new Livro(13, "Sueli Carneiro",4,"Racismo, sexismo e desigualdade no Brasil");
		Livro livro14 = new Livro(14, "Laura Barcella",4,"Lute como uma garota: 60 Feministas que Mudaram o Mundo");
		Livro livro15 = new Livro(15, "Djamila Ribeiro",4,"Pequeno manual antirracista");
		Livro livro16 = new Livro(16, "Ana Maria Machado",2,"Hist�rias � brasileira, vol. 1 ");
		Livro livro17 = new Livro(17, "Heather Alexander",2,"Mitologia grega: Uma introdu��o para crian�as");
		Livro livro18 = new Livro(18, "Clarice Lispector",2,"Doze lendas brasileiras: Como nasceram as estrelas");
		Livro livro19 = new Livro(19, "Mauricio Sousa",2,"Turma da M�nica: Contos da Carochinha ");
		
		biblioteca.getListaDeLivros().add(livro1);
		biblioteca.getListaDeLivros().add(livro2);
		biblioteca.getListaDeLivros().add(livro3);
		biblioteca.getListaDeLivros().add(livro4);
		biblioteca.getListaDeLivros().add(livro5);
		biblioteca.getListaDeLivros().add(livro6);
		biblioteca.getListaDeLivros().add(livro7);
		biblioteca.getListaDeLivros().add(livro8);
		biblioteca.getListaDeLivros().add(livro9);
		biblioteca.getListaDeLivros().add(livro10);
		biblioteca.getListaDeLivros().add(livro11);
		biblioteca.getListaDeLivros().add(livro12);
		biblioteca.getListaDeLivros().add(livro13);
		biblioteca.getListaDeLivros().add(livro14);
		biblioteca.getListaDeLivros().add(livro15);
		biblioteca.getListaDeLivros().add(livro16);
		biblioteca.getListaDeLivros().add(livro17);
		biblioteca.getListaDeLivros().add(livro18);
		biblioteca.getListaDeLivros().add(livro19);
		
			try (Scanner ler = new Scanner(System.in)) {
				int opcaoDesejada;
				int idDoLivro;
				int generoDoLivro;
				int contador = 19;
				int proximaPessoa = -1;
				String autorDoLivro;
				String tituloDoLivro;
				String nome;
				
				
				Date data = new Date();
				DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
				
			while(proximaPessoa != 0) {
				
				System.out.println("\nOl�! Voc� tem duas op��es:\n1 --> Abrir O Cofre");
				System.out.println("0 --> Fechar O Cofre");
				System.out.print("Escolha a op��o desejada: ");
				proximaPessoa = ler.nextInt();
				
				while (proximaPessoa < 0 || proximaPessoa > 1) {
					System.out.print("N�mero inv�lido. Por favor, escolha a op��o desejada: ");
					proximaPessoa = ler.nextInt();
				}
				if(proximaPessoa == 0) {
					System.out.println("\nFechando o programa...");
					break;
				}
			
				System.out.println("------ BEM VINDE AO COFRE ------");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("  A Biblioteca Solid�ria e Inclusiva ");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("  "+f.format(data));
				Thread.sleep(1000);
				System.out.println();
				System.out.print("Digite seu nome: ");
				nome = ler.next();
				
				do {
					
					System.out.println("\n--------- Ol�, "+nome+", vamos as suas op��es! ---------\nO que voc� gostaria de fazer hoje?");
					System.out.println("1 - Doar Livro");
					System.out.println("2 - Adotar Livro");
					System.out.println("3 - Para listar todos livros que a biblioteca cont�m");
					System.out.println("4 - Para listar livros que a biblioteca cont�m por g�nero");
					System.out.println("0 - Para sair");
					System.out.print("Escolha a op��o desejada: ");
					opcaoDesejada = ler.nextInt();
					if (opcaoDesejada < 0 || opcaoDesejada > 4) {
						System.out.print("N�mero inv�lido. Por favor, insira um n�mero entre 0 e 4: ");
					}
					
					switch(opcaoDesejada) {
					
					case 1:
						contador++;
						idDoLivro = contador;
							
						ler.nextLine();
						
						System.out.print("Informe o t�tulo do livro: ");
						tituloDoLivro = ler.nextLine();
						
						System.out.print("Informe o autor do livro: ");
						autorDoLivro = ler.nextLine();
						
						System.out.print("\nInforme o g�nero do livro:\n1 --> LGBTQIA+\n2 --> Infantil\n3 --> Autoajuda\n4--> Ci�ncias Sociais\nInsira o n�mero correspondente:");
						generoDoLivro = ler.nextInt();
						
						Livro livro = new Livro(idDoLivro, autorDoLivro, generoDoLivro, tituloDoLivro);
						biblioteca.doarLivro(livro);
						
						System.out.println("\n"+nome+", agradecemos muito pela sua doa��o!\n");
						
						break;
					
					case 2:
						do {
						System.out.println("\nO que vamos fazer agora?");
						System.out.println("1 - Ver todos os livros da biblioteca");
						System.out.println("2 - Ver os livros da biblioteca por g�nero");
						System.out.println("3 - Adotar o livro");
						System.out.print("Escolha a op��o desejada: ");
						opcaoDesejada = ler.nextInt();
						
						if (opcaoDesejada < 0 || opcaoDesejada > 3) 
						{
							System.out.print("N�mero inv�lido. Por favor, insira um n�mero entre 1 e 3: ");
						}	
							switch(opcaoDesejada) {
						
							case 1:
								List<Livro> todosOsLivros = biblioteca.quaisLivrosContemNaBiblioteca();
								
								if(todosOsLivros.isEmpty()) 
									{
									System.out.println("N�o tem nenhum livro na biblioteca.");
									}
								else 
								{
									System.out.println("Lista dos livros dispon�veis na biblioteca: ");
									for(Livro i : todosOsLivros) 
									{
										System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
									}
	
								}
								
								biblioteca.quaisLivrosContemNaBiblioteca();
							
								break;
							
							case 2:
								List<Livro> todosOsLivros1 = biblioteca.quaisLivrosContemNaBiblioteca();
								
								System.out.println("Voc� gostaria de visualizar os livros de qual g�nero?\n1 --> LGBTQIA+\n2 --> Infantil\n3 --> Autoajuda\n4 --> Ci�ncias Sociais\nInsira o n�mero correspondente:");
								generoDoLivro = ler.nextInt();
								
								switch(generoDoLivro) {
								case 1:
									for(Livro i : todosOsLivros1) {
										if(i.getGenero() == 1) {
											System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
										}
									}
									break;
								case 2:
									for(Livro i : todosOsLivros1) {
										if(i.getGenero() == 2) {
											System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
										}
									}
									break;
								case 3:
									for(Livro i : todosOsLivros1) 
									{
										if(i.getGenero() == 3) 
										{
											System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
										}
									}
									break;
								case 4:
									for(Livro i : todosOsLivros1) 
									{
										if(i.getGenero() == 4) 
										{
											System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
										}
									}
									break;
									
								}
							
								}
						}while (opcaoDesejada != 3);
						
						
						System.out.print("Digite um n�mero ID para adotar o livro escolhido: ");
						idDoLivro = ler.nextInt();
						
						boolean livroFoiAdotado = biblioteca.adotarLivro(idDoLivro);
						
						if (livroFoiAdotado == true) 
						{
							System.out.println("Livro adotado com sucesso!\n"+nome+", muito obrigado por dar um lar feliz para esse livro!");
						} else {
							System.out.println("Livro n�o foi encontrado!\n");
						}
						
						break;
					
					case 3:
						
						List<Livro> todosOsLivros = biblioteca.quaisLivrosContemNaBiblioteca();
						if(todosOsLivros.isEmpty()) {
							System.out.println("N�o tem nenhum livro na biblioteca.");
						}
						else {
							System.out.println("Lista dos livros dispon�veis na biblioteca: ");
							for(Livro i : todosOsLivros) {
								System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
							}
	
						}
						
						biblioteca.quaisLivrosContemNaBiblioteca();
					
						break;
					
					case 4:
						List<Livro> todosOsLivros1 = biblioteca.quaisLivrosContemNaBiblioteca();
						
						System.out.println("Voc� gostaria de visualizar os livros de qual g�nero?\n1 --> LGBTQIA+\n2 --> Infantil\n3 --> Autoajuda\n4 --> Ci�ncias Sociais\nInsira o n�mero correspondente:");
						generoDoLivro = ler.nextInt();
						
						switch(generoDoLivro) {
						case 1:
							for(Livro i : todosOsLivros1) {
								if(i.getGenero() == 1) {
									System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
								}
							}
							break;
						case 2:
							for(Livro i : todosOsLivros1) {
								if(i.getGenero() == 2) {
									System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
								}
							}
							break;
						case 3:
							for(Livro i : todosOsLivros1) 
							{
								if(i.getGenero() == 3) 
								{
									System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
								}
							}
							break;
						case 4:
							for(Livro i : todosOsLivros1) 
							{
								if(i.getGenero() == 4) 
								{
									System.out.println("ID - "+i.getId()+" ***** T�tulo - "+i.getTitulo()+" ***** Autor - "+i.getAutor()+" ***** G�nero - "+i.getGeneroString());
								}
							}
							break;
						}
								
						}			
			}while(opcaoDesejada != 0);
		
		System.out.println(nome+", obrigado por usar O Cofre!");
	
			}
		}
	}
}
