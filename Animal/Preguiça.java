package Animal;

public class Pregui�a extends Animal {
	private String Som;
	private String sobemEmArvores;
	
	public Pregui�a()
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
		return "O bicho-pregui�a "+super.getNome()+" tem "+super.getIdade()+" anos"
				+ ""+" e emitem o som "+this.getSom()+" e tem habito de "+this.getSobemEmArvores();
	}
	

}
