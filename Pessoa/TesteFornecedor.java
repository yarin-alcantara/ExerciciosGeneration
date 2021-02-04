package Pessoa;

public class TesteFornecedor {
	public static void main(String [] args) {					
		
		
		Fornecedor Carla = new Fornecedor("Carla Lemos","22","Feminino","Avenida das Flores, nº65, apto 102","27","999965099","12345678910",3000,8500);
		Fornecedor Bruno = new Fornecedor("Bruno Gomes","42","Masculino","Avenida das Borboletas, S/N , apto 605","011","999999999","98745632101",25000,1000);
		
		Carla.Info();
		Carla.ValidarCPF();
		Carla.ValidarDDD();
		Carla.Validartelefone();
		System.out.println(" ");
		Carla.Saldo();
		System.out.println(" ----------- ");
		Bruno.Info();
		Bruno.ValidarCPF();
		Bruno.ValidarDDD();
		Bruno.Validartelefone();
		System.out.println(" ");
		Bruno.Saldo();
		
	}
	
	
}
