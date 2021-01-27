package exercicios27012021;

import java.util.Scanner;

public class questao3 {
		
	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Olá, favor inserir sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=18 && idade<=25) {
			System.out.println("Você pertence a categoria: Adulto");
			
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("Você pertence a categoria: Juvenil");
		}
		else if (idade>=10 && idade<=14) {
			System.out.println("Você pertence a categoria: Infantil");
		}
		else {
			System.out.println("Idade invalida!!!!");
		}
	}
}
