package exercicios29012021;

import java.util.Scanner;

public class questao1 {
 	    public static void main(String [] args) {
		    
 	    	int pts, n=5;
 	    	int vet[] = new int[n];
 	    	
 	    	
 	    	try (Scanner ler = new Scanner(System.in)) {
				for(pts = 0; pts< n; pts++) {
					System.out.print("Digite o valor da atividade "+(pts+1)+"º  ");
					vet[pts]=ler.nextInt();
					
				}
			}
 	    	
 	    	int menor=vet[0], maior = vet[0];
 	    		 
 	    		for(pts=0;pts<5;pts++) {
 	    			
 	    			if(vet[pts]<menor) {
 	    				
 	    				menor=vet[pts];
 	    			}
 	    			else if(vet[pts] > maior) {
 	    				maior = vet[pts];
 	    			}
 	    		}
	
 	    		for(pts=0;pts<5;pts++) {
 	    			if (vet[pts] == maior) {
 	    				System.out.printf("\nO vetor[%d] %2d - Maior Valor\n",pts,vet[pts]);
 	    		}
 	    			else
 	    				System.out.printf("\nO vetor[%d] %2d\n",pts,vet[pts]);
		}
 	    }
}

	 
		
		
	

