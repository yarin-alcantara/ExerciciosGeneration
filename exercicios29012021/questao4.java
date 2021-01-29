package exercicios29012021;

import java.util.Scanner;

public class questao4 {
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3],a,b,soma=0,diagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(a=0;a<3;a++){
			for(b=0;b<3;b++){
				
				System.out.printf("\nDigite o valor [%d] [%d]: ",(a+1),(b+1));
				matriz[a][b] = leia.nextInt();
				soma = soma + matriz[a][b];
				
				if(a==b){
					diagonal = diagonal + matriz[a][b];
				}
			}
		}
				System.out.print("\nO valor do somatório total: "+soma);
				System.out.print("\nO valor do somatório da diagonal: "+diagonal);
	}
}
