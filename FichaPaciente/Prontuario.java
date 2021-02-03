package FichaPaciente;

import java.util.Date;

public class Prontuario {

	public static void main(String[] args) {
		 FichaPaciente[] prontuario= new FichaPaciente[5];
		 
		 Date data = new Date();
		 
		
		 
		 prontuario[0] = new FichaPaciente("Luiza Valença","Feminino",32,62.300,160,"Rua das Flores, nº 55",32322020,130,80,88);
		 prontuario[1] = new FichaPaciente("Claudia Santos","Outros",21,80.200,170,"Beco das Neves, s/n, casa azul",99986851,110,70,96);
		 prontuario[2] = new FichaPaciente("Fernando Jardins","Masculino",57,98.100,175,"Avenida Colombo, nº 201, apt 302 ",996632142,150,90,91);
		 prontuario[3] = new FichaPaciente("Flávia Aleixo","Feminino",19,52.900,168,"Avenida Chiquinho, nº 1250, apt 1023 ",981233364,110,60,110);
		 prontuario[4] = new FichaPaciente("Frederico Rocha","Masculino",22,87.000,182,"Rua da Pastilha, nº 12",999855142,140,80,85);
		 
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println("Olá, esses são os novos pacientes cadastrados do dia "+data);
		 System.out.println("\n O cadastro inicial do Prontuario: "+"\n");
		 System.out.println(" ");
		 prontuario[0].ImprimirInfo();
		 System.out.println("");
		 System.out.println(" ------------- PROXIMO CADASTRO ------------- ");
		 System.out.println("");
		 prontuario[1].ImprimirInfo();
		 System.out.println("");
		 System.out.println(" ------------- PROXIMO CADASTRO ------------- ");
		 System.out.println("");
		 prontuario[2].ImprimirInfo();
		 System.out.println("");
		 System.out.println(" ------------- PROXIMO CADASTRO ------------- ");
		 System.out.println("");
		 prontuario[3].ImprimirInfo();
		 System.out.println("");
		 System.out.println(" ------------- PROXIMO CADASTRO ------------- ");
		 System.out.println("");
		 prontuario[4].ImprimirInfo();
		 System.out.println("");
		 System.out.println(" ------------- FIM DO EXPEDIENTE ------------- ");
		 
		 
	}

}
