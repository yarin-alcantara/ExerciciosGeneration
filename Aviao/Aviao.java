package Aviao;

public class Aviao {
		String cor;
		String corSecundaria;
		String modelo;
		int ano;
		String companhiaArea;
		
		public Aviao (String companhia, String cor1, String cor2, String modelo, int ano) {
			
			this.cor=cor1;
			this.corSecundaria=cor2;
			this.modelo=modelo;
			this.ano=ano;
			this.companhiaArea=companhia;
			
			
		}
		
		public void ImprimirInfo() {
			System.out.println("O avião da companhia "+companhiaArea+" tem como cor principal"
					+ " "+cor+" e a cor secundária "+corSecundaria);
					
			System.out.println("Seu  modelo é um "+modelo+" e seu ano de fabricação é: "+ano);
	
		
		}
		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getCorSecundaria() {
			return corSecundaria;
		}

		public void setCorSecundaria(String corSecundaria) {
			this.corSecundaria = corSecundaria;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public String getCompanhiaArea() {
			return companhiaArea;
		}

		public void setCompanhiaArea(String companhiaArea) {
			this.companhiaArea = companhiaArea;
		}
		
}
