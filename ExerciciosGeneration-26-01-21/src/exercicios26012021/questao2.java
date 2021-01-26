package exercicios26012021;
		import java.util.Scanner;
		
public class questao2 {
	
		public static void main(String args [])
		{
			int totaldias, anos, meses, dias;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Me diga o total de dias: ");
			totaldias = ler.nextInt();
			
			anos=(totaldias/365);
			meses=(totaldias%365)/30;
			dias=(totaldias%365)%30;
			
			System.out.println("Você tem: "+anos+" ano(s) e "+meses+" mes(es) e "+dias+" dia(s) de vida!");
		}

}
