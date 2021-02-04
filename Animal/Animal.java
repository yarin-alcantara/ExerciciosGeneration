package Animal;

/*
 *  /*
  * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos 
  * (observe a tabela), utilize os seus conhecimentos e distribua as características de forma
  *  que tudo o que for comum a todos os animais fique na classe Animal: 
  *  ANIMAL ---- Cachorro -- Cavalo --- Preguiça
  *  Cachorro - Nome, Idade, Deve imitir Som, Deve Correr
  *  Cavalo - Nome, Idade, Deve imitir Som, Deve Correr
  *  Preguiça - Nome, Idade, Deve imitir Som, Deve subir em arvores
 */

public class Animal {
	private String Nome;
	private int idade;
	
	
	public Animal() 
	{
		
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
 
}
