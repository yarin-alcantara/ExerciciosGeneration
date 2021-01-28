package exercicios28012021;
import java.util.Scanner;

public class questao1 {
	    public static void main(String[] args) {
	    	
	    	int x,soma;
	    	
	    	Scanner ler = new Scanner(System.in);
	    	
	    	for(x=1000;x<=1999;x++) {
	    	     
	    		soma=x%11;
	    		if(soma==5) {
	    			System.out.println("Os seguintes numeros: "+x+" quando divididos por 11 o resto é "+soma);

	    		}
	    		
	    				
	    }
}
}

