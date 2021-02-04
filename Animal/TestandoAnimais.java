package Animal;

import java.util.Date;
import java.text.DateFormat;

public class TestandoAnimais {
		public static void main(String []args) {
			
			Cachorro dog=new Cachorro();
			dog.setNome("Zeca");
			dog.setIdade(5);
			dog.setSomAuau("latido AU AU");
			dog.setCorrer(15);
			
			Cavalo horse=new Cavalo();
			horse.setNome("Eliel");
			horse.setIdade(3);
			horse.setSomRelicham("relincho ");
			horse.setCorrem(45);
			
			Preguiça prepre=new Preguiça();
			prepre.setNome("Mentinha");
			prepre.setIdade(8);
			prepre.setSom("de resmungo");
			prepre.setSobemEmArvores(" dormir e subir em arvores.");
			
			Date data = new Date();
			DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
			
			
			System.out.println();
			System.out.println();
			System.out.println("                                  ----- Ficha dos Animais -----");
			System.out.println(); 
			System.out.println("                                *** Animais resgatados do dia ***");
			System.out.println();
			System.out.println("                          *** "+f.format(data)+" *** ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("   "+dog.getNome());
			System.out.println();
			System.out.println("   "+horse.getNome());
			System.out.println();
			System.out.println("   "+prepre.getNome());
			
			
			
		
		}
		
}
