package Pessoa;

import java.text.NumberFormat;
import java.util.Locale;


public class Fornecedor extends Pessoa{

	/*
	 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
	 *  Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam
	 *   a classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) 
	 *   e valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, 
	 *   para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve 
	 *   a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada 
	 *   a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento 
	 *   dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa. 
	 */
	
	
	double ValorCredito;
	double ValorDivida;
	
	Locale ptBr = new Locale("pt","BR");
	
	
	public Fornecedor(String Nome, String idade, String sexo, String endereço, String DDD, String telefone,String CPF, double ValorCredito, double ValorDivida) {
		
		super(Nome, idade, sexo, endereço, DDD, telefone, CPF);
		this.ValorCredito=ValorCredito;
		this.ValorDivida=ValorDivida;
		
	}
	
	   public void Info() 
	   {
	
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(ptBr);
		System.out.println("\nNome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Sexo: "+getSexo());
		System.out.println("Endereço: "+getEndereço());
		System.out.println("Telefone: "+"("+getDDD()+")"+" "+getTelefone());
		System.out.println("CPF: "+getCPF());
		System.out.println(" ");
		System.out.println("O valor do Credito disponivel: "+dinheiro.format(ValorCredito));
		System.out.println("O valor da Divida: "+dinheiro.format(ValorDivida));
	    }
		public void Saldo()
		{
			NumberFormat dinheiro = NumberFormat.getCurrencyInstance(ptBr);
			double diferença = ValorCredito - ValorDivida;
			
			System.out.println("A diferença de saldo é de: "+dinheiro.format(diferença));
		
		}

	public double getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(double valorCredito) {
		ValorCredito = valorCredito;
	}

	public double getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	}
}
