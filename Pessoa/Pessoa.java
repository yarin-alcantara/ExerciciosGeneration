package Pessoa;

public class Pessoa {
        
    /*
     * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters)
     *  e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores
     *   conforme sua percep��o. Atributos: String nome; String endere�o; String telefone;
      */
	
	
	  private String Nome;
	  private String idade;
	  private String sexo;
	  private String endere�o;
	  private String DDD;
	  private String telefone;
	  private String CPF;
	  
	  public Pessoa(String Nome,String idade, String sexo, String endere�o, String DDD,String telefone, String CPF)
	  {
		  super();
		  this.Nome=Nome;
		  this.idade=idade;
		  this.sexo=sexo;
		  this.endere�o=endere�o;
		  this.DDD=DDD;
		  this.telefone=telefone;
		  this.CPF=CPF;
		  
}

	public String getDDD() {
		return DDD;
	}

	public void setDDD(String dDD) {
		DDD = dDD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public void ValidarCPF() {
		if(getCPF().length()!=11) {
			System.out.println("*** CPF Invalido. Verifique! ***");
		}
		else {
			System.out.println("*** CPF Validado! ***");
		}
	}
	public void ValidarDDD() {
		if(getDDD().length()!=3) 
		{
			System.out.println("*** DDD com quantidade de caracteres invalida. Verique! ***");
		}
		else
		{
			System.out.println("");
		}
		
	}
	public void Validartelefone() {
		if(getTelefone().length()!=9) {
			System.out.println("*** Telefone com quantidade de caracteres invalida. Verique! ***");
		}
		else 
		{
			System.out.println("");
		}
	}
	
}
