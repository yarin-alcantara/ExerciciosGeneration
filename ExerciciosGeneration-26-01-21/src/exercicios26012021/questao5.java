package exercicios26012021;

			import java.util.Scanner;
				
public class questao5 {
		public static void main(String args[])
		{
			int peso2=2, peso3=3,peso5=5;
			float nota1, nota2, nota3, media;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Por favor, me diga a nota da Primeira prova: ");
			nota1 = ler.nextFloat();
			System.out.println("Por favor, me diga a nota da Segunda prova: ");
			nota2 = ler.nextFloat();
			System.out.println("Por favor, me diga a nota da Terceira prova: ");
			nota3 = ler.nextFloat();
			
			media=((nota1*peso2)+(nota2*peso3)+(nota3*peso5))/(peso2+peso3+peso5);
			
			System.out.printf("\nA sua média das provas foi de: %2.2f ",media);
			
			
			
					
		}
}
