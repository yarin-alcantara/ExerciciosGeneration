package Aviao;

public class AmostraAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("Gol","Branco","Laranja","Boeing747", 2015);
		
		System.out.println("****************************");
		System.out.println("\n");
		aviao1.ImprimirInfo();
		System.out.println("\n");
		
		System.out.println("          ****************************          ");
		
		System.out.println("\n");
		System.out.println("--------- Transferência de Companhia Area -------");
		System.out.println("\n");
		aviao1.setCompanhiaArea("Azul");
		aviao1.setCorSecundaria("Azul");
		aviao1.ImprimirInfo();
		
	}
	
	

}
