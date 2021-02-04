package Pessoa;

import java.text.NumberFormat;
import java.util.Locale;

public class Empregado extends Pessoa{
	/*
	 * 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância
	 *  da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos 
	 *  codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
	 *   Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
	 *    Escreva um programa de teste adequado para a classe Empregado. 
	 */

			private int CodigoSetor;
			private double SalarioBase;
			private double imposto;
			
			Locale ptBr = new Locale("pt","BR");
	
         public Empregado(String Nome, String idade, String sexo,
        		 String endereço, String DDD, String telefone, String CPF,
        		 int CodigoSetor, double SalarioBase) 
         {
	      super(Nome, idade, sexo, endereço, DDD, telefone, CPF);
	      this.CodigoSetor=CodigoSetor;
	      this.SalarioBase=SalarioBase;
	      ;
	      
}
         public void Info() 
  	   {
  	
  		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(ptBr);
  		System.out.println("\nNome: "+getNome());
  		System.out.println("Idade: "+getIdade()+ "anos");
  		System.out.println("Sexo (opcional): "+getSexo());
  		System.out.println("Endereço: "+getEndereço());
  		System.out.println("Telefone: "+"("+getDDD()+")"+" "+getTelefone());
  		System.out.println("CPF: "+getCPF());
  		System.out.println("Codigo do Setor: "+getCodigoSetor());
  		System.out.println("Salário Base: "+dinheiro.format(SalarioBase));
  		
  		
  	   }
         public void Salario()
         {
        	 NumberFormat dinheiro = NumberFormat.getCurrencyInstance(ptBr);
        	 if (getSalarioBase()>=00 && getSalarioBase()<=1903.98) {
        		 
        		 System.out.println("O salário líquido do funcionário(a) "+getNome()+ " é de: "+dinheiro.format(SalarioBase));
        		 }
        	 if (getSalarioBase()>=1903.99 && getSalarioBase()<=2826.65) {
        		 imposto=7.5/100;	 
        		 double salariototal = SalarioBase -  (SalarioBase*imposto);
        		 System.out.println("O salário líquido do funcionário(a) "+getNome()+ " é de: "+dinheiro.format(salariototal));
        	 }
        	 if (getSalarioBase()>=2826.66 && getSalarioBase()<=3751.05) {
        		 imposto=15.0/100;	 
        		 double salariototal = SalarioBase -  (SalarioBase*imposto);
        		 System.out.println("O salário líquido do funcionário(a) "+getNome()+ " é de: "+dinheiro.format(salariototal));
        	 }
        	 if (getSalarioBase()>=3751.06 && getSalarioBase()<=4664.68) {
        		 imposto=22.5/100;	 
        		 double salariototal = SalarioBase -  (SalarioBase*imposto);
        		 System.out.println("O salário líquido do funcionário(a) "+getNome()+ " é de: "+dinheiro.format(salariototal));
        	 }
        	 if (getSalarioBase()>=4664.68 && getSalarioBase()<=100000000 ) {
        		 imposto=27.5/100;	 
        		 double salariototal = SalarioBase -  (SalarioBase*imposto);
        		 System.out.println("O salário líquido do funcionário(a) "+getNome()+ " é de: "+dinheiro.format(salariototal));
        	 }
        	 
        	 else {
        		
        	 }
          
         }
       
		public int getCodigoSetor() {
			return CodigoSetor;
		}


		public void setCodigoSetor(int codigoSetor) {
			CodigoSetor = codigoSetor;
		}


		public double getSalarioBase() {
			return SalarioBase;
		}


		public void setSalarioBase(double salarioBase) {
			SalarioBase = salarioBase;
		}


		public double getImposto() {
			return imposto;
		}


		public void setImposto(double imposto) {
			this.imposto = imposto;
		}
}