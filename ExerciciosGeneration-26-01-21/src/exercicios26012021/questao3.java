package exercicios26012021;

import java.util.Scanner;

public class questao3 {
		public static void main(String args []) {
			
			int totalsegundos, horas, minutos, segundos;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Me diga os segundos: ");
			totalsegundos = ler.nextInt();
			
			horas = (totalsegundos/3600);
			minutos = (totalsegundos%3600)/60;
			segundos = (totalsegundos%3600)%60;
			
	System.out.println("O tempo de duração é de: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos!");
			
			
			
			
			
		}
}
