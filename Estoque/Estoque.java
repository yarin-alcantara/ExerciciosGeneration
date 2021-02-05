package Estoque;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar 
 * com Collection do tipo List do Java para manipular os dados desse estoque, 
 * o programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
 */

public class Estoque {
		public static void main(String []args) {
			
			int opcoes;
			int quantidade=0;
		
			
			try (Scanner ler = new Scanner(System.in)) {
			
			
			ArrayList<String> meuestoque = new ArrayList<String>();
			
			Date data = new Date();
			DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
			
			System.out.println();
			System.out.println("---- FLORICULTURA JARDIM ENCANTADO  ----");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("  BEM VINDE AO ESTOQUE DA SUA EMPRESA "); 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("  "+f.format(data));
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			do {
				System.out.println("   Escolha uma opção: ");
				System.out.println();
				System.out.println("**********************");
				System.out.println();
				System.out.println("(1) - Adicionar um produto ");
				System.out.println("(2) - Remover um produto ");
				System.out.println("(3) - Modificar/Atualizar um produto");
				System.out.println("(4) - Visualizar estoque completo");
				System.out.println("(0) - Finalizar");
				System.out.println();
				System.out.println("***********************");
				opcoes = ler.nextInt();
				
				switch(opcoes){
				case 1:
					ler.nextLine();
					System.out.println("Você escolheu a opção (1)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println();
					System.out.print("Insira o produto que deseja adicionar: ");
					String produto=ler.nextLine();
					meuestoque.add(produto);
					System.out.println();
					quantidade++;
					break;
					
				case 2: 
					ler.nextLine();
					System.out.println("Você escolheu a opção (2)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println();
					System.out.print("Digite qual produto deseja remover: ");
					String remover = ler.nextLine();
					if(meuestoque.contains(remover))
					{
					meuestoque.remove(remover);
					quantidade--;
					
					}
					else
					{
						System.out.println("** Este produto não está cadastrado **");
					}
					break;
				case 3:
					ler.nextLine();
					System.out.println("Você escolheu a opção (3)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println();
					System.out.print("Digite qual produto deseja atualizar: ");
					String modificar = ler.nextLine();
					System.out.println();
					System.out.print("Insira o produto que irá substituir: "+modificar);
					String novo = ler.nextLine();
					if(meuestoque.contains(modificar)) {
						meuestoque.remove(modificar);
						meuestoque.add(novo);
						quantidade++;
						
					}
					else {
						System.out.println("*Erro* - Produto não cadastrado!!!!!!");
					    
					}   
					
				case 4:
					System.out.println("Você escolheu a opção (4)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("Seu estoque no momento: ");
					System.out.println();
					System.out.println(meuestoque);
					System.out.println();
					System.out.println(quantidade);
					break;
					
				default:
					System.out.println("Você escolheu a opção(0)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("Finalizou o programa!!!");
		
				}
				
			}while(opcoes !=0);
		}
}
}
