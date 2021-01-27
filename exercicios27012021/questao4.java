package exercicios27012021;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double numero;
			Scanner ler= new Scanner(System.in);
			
			System.out.println("Bem vinde, digite um numero: ");
			numero = ler.nextDouble();
					
				if (numero%2==0)	{
					
					System.out.println("Este numero é par! ");
				     numero = Math.sqrt(numero);
				     System.out.printf("\nA raiz quadrada dele é de: %2.3f ",numero);
				}
				else {
					System.out.println("Este numero é impar! ");
					numero=Math.pow(numero, 2);
					System.out.printf("\nA Potência ao quadrado dele é de: %2.2f ",numero);
				}
					
			
	}

}
