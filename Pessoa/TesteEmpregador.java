package Pessoa;

public class TesteEmpregador {
			public static void main (String args[]) {
				
				Empregado Marcela = new Empregado("Marcela Lima","29","Outros","Rua da Torre, n�99, apto 1003",""
						+ "028","999963214","11122233366",255,3000);
				Empregado Julia = new Empregado("Julia Roldi","26","Feminino","Rua do tutu, n�999, apto 606",""
						+ "027","998151253","112222515841",0054,7500);
				Empregado Eduardo = new Empregado("Eduardo Neto","45","Masculino","Avenida Piqueri, S/N",""
						+ "011","9202563012","784512654511",012,15000);
				Empregado Ma�sa = new Empregado("Ma�sa Carpe Diem","32","Feminino","Avenida Paulista, n�1025, apto 1502",""
						+ "011","9325118845","124152152015",101,18000);
				
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" -------- Ficha do Funcionarios --------");
				System.out.println(" ");
				System.out.println(" ");
				Marcela.Info();
				Marcela.ValidarCPF();
				Marcela.ValidarDDD();
				Marcela.Validartelefone();
				Marcela.Salario();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ---------------------------------------- ");
				System.out.println(" ");
				Julia.Info();
				Julia.ValidarCPF();
				Julia.ValidarDDD();
				Julia.Validartelefone();
				Julia.Salario();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ---------------------------------------- ");
				System.out.println(" ");
				Eduardo.Info();
				Eduardo.ValidarCPF();
				Eduardo.ValidarDDD();
				Eduardo.Validartelefone();
				Eduardo.Salario();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ---------------------------------------- ");
				System.out.println(" ");
				Ma�sa.Info();
				Ma�sa.ValidarCPF();
				Ma�sa.ValidarDDD();
				Ma�sa.Validartelefone();
				Ma�sa.Salario();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ---------------------------------------- ");
				
				
				
			}
}
