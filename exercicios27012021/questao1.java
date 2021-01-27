package exercicios27012021;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numero = 0, maior = 0, menor = 0; 
			
			Scanner ler = new Scanner(System.in);
		
			
			for (int x= 0; x<3; x++) {
				
				System.out.println("Insira um numero: ");
				numero = ler.nextInt();
				
					if(x ==0) {
						maior=numero;
						menor=numero;
							
					}
					
					if(numero > maior) {
						maior = numero;
					
					}
					
						
			}
			
			System.out.println("O maior numero é: " +maior);
			
	}
	
	

}
