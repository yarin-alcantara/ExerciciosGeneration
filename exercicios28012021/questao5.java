package exercicios28012021;

import java.util.Scanner;

public class questao5 {
		public static void main(String[] args) {
			
			int num, T=0;
			
			Scanner ler=new Scanner(System.in);
			
			do
			{
				System.out.print("Digite um numero: ");
				num=ler.nextInt();
				T=num+T;
			}
			while (num!=0);
				System.out.println("A soma desses numeros é: "+T);
		}
}
