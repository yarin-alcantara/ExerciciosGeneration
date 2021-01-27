package exercicios27012021;

import java.util.Scanner;

public class questao2 {
		public static void main(String[] args) {
					
			int n1,n2,n3;
			
			Scanner ler = new Scanner(System.in);
		
			System.out.print("Primeiro Número: ");
			n1 = ler.nextInt();
			System.out.print("Segundo Número: ");
			n2 = ler.nextInt();
			System.out.print("Terceiro Número: ");
			n3 = ler.nextInt();
			
			if (n1 < n2) {
				if (n2 < n3) {
					System.out.println("A Ordem dos numeros é: "+"\n"+n1+"\n-"+n2+"\n-"+n3);
				}
				else if(n1 < n3) {
					System.out.println("A Ordem dos numeros é: "+"\n"+n1+"\n"+n3+"\n"+n2);
				}
				else {
					System.out.println("A Ordem dos numeros é: "+"\n"+n3+"\n"+n2+"\n"+n1);
				}
			}
			else if(n2 < n3) {
				if(n1 < n3) {
					System.out.println("A Ordem dos numeros é: "+"\n"+n2+"\n"+n1+"\n"+n3);
				}
				else {
					System.out.println("A Ordem dos numeros é: "+"\n"+n2+"\n"+n3+"\n"+n1);
				}
			}
			else
				System.out.println("A Ordem dos numeros é: "+"\n"+n3+"\n"+n2+"\n"+n1);
				}
}
