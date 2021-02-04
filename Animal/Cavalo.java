package Animal;

public class Cavalo extends Animal{
	private String SomRelicham;
	private int correm;
	
	
	public Cavalo()
	{
		
	}
	public String getSomRelicham() {
		return SomRelicham;
	}
	public void setSomRelicham(String somRelicham) {
		SomRelicham = somRelicham;
	}
	public int getCorrem() {
		return correm;
	}
	public void setCorrem(int correm) {
		this.correm = correm;
	}
	
	public String getNome() {
		return "O cavalo "+super.getNome()+" tem  "+super.getIdade()+" anos"+" e emite o som de "
				+ ""+this.getSomRelicham()+" e sua velocidade maxima é de "
				+ ""+this.getCorrem()+ " km/h!";
	}

}
