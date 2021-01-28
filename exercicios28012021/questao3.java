package exercicios28012021;

import java.util.Scanner;

public class questao3 {
		public static void main(String[] args) {
			
			int idade=0, maior=0, menor=0;
			
			Scanner ler = new Scanner(System.in);
			
			while(idade!=-99) {
				
			      System.out.print("Me diga sua idade: ");
			      idade=ler.nextInt();
			      
				if(idade<=21)
				{
					menor++;
				}
				if(idade>=50) 
				{
					maior++;
				}
				System.out.println("A quantidade de pessoas com menos de 21 anos é de: "+menor);
				System.out.println("A quantidade de pessoas com mais de 50 anos é de: "+maior);
			}
			
		}
}
