package Animal;

public class Preguiça extends Animal {
	private String Som;
	private String sobemEmArvores;
	
	public Preguiça()
	{
		
	}
	public String getSom()
	{
		return Som;
	}
	public void setSom(String som) {
		Som = som;
	}
	public String getSobemEmArvores() {
		return sobemEmArvores;
	}
	public void setSobemEmArvores(String sobemEmArvores) {
		this.sobemEmArvores = sobemEmArvores;
	}
	
	public String getNome() {
		return "O bicho-preguiça "+super.getNome()+" tem "+super.getIdade()+" anos"
				+ ""+" e emitem o som "+this.getSom()+" e tem habito de "+this.getSobemEmArvores();
	}
	

}
