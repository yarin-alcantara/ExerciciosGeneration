package Produto;

public class especificaçõesNotebook {
	
	   String marca;
	   String modelo;
	   String cor;
	   String sistemaoperacional;
	   String processador;
	   double tamanhodatela;
	   int memoria;
	   int armazenamento;
	   
	   public especificaçõesNotebook(String marca, String modelo, String cor,String sisOp, String process, double ttela, int mm, int armaz)
	   {
	   
	   this.marca=marca;
	   this.modelo=modelo;
	   this.cor=cor;
	   this.sistemaoperacional=sisOp;
	   this.processador=process;
	   this.tamanhodatela=ttela;
	   this.memoria=mm;
	   this.armazenamento=armaz;
	   
	   
	   }
	   public void ImprimirInfo() {
		   System.out.println("Notebook: "+marca);
		   System.out.println("Modelo: "+modelo);
		   System.out.println("Cor: "+cor);
		   System.out.println("Sistema Operacional: "+sistemaoperacional);
		   System.out.println("Processor: "+processador);
		   System.out.println("Tamanho da Tela: "+tamanhodatela+" 'HD");
		   System.out.println("Memoria: "+memoria+" GB");
		   System.out.println("Armazenamento: "+armazenamento+" T");
	   }
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getSistemaoperacional() {
		return sistemaoperacional;
	}
	public void setSistemaoperacional(String sistemaoperacional) {
		this.sistemaoperacional = sistemaoperacional;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public double getTamanhodatela() {
		return tamanhodatela;
	}
	public void setTamanhodatela(double tamanhodatela) {
		this.tamanhodatela = tamanhodatela;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	   
	   
	   
	   
}
