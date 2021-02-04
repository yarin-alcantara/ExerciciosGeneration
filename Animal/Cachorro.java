package Animal;

public class Cachorro extends Animal{
			private String SomAuau;
			private int correr;
			
			
			
			public Cachorro()
			{
				
			}
			public String getSomAuau() {
				return SomAuau;
			}
			public void setSomAuau(String somAuau) {
				SomAuau = somAuau;
			}
			public int getCorrer() {
				return correr;
			}
			public void setCorrer(int correr) {
				this.correr = correr;
			}
			
			public String getNome() {
				return "O cachorro "+super.getNome()+" tem  "+super.getIdade()+" anos"
					+ " e emite o som de "+this.getSomAuau()+" e sua velocidade maxima é de "
					+ ""+this.getCorrer()+" km/h!";
			
			}
			
					
	

}
