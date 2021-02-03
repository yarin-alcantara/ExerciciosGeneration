package FichaPaciente;

public class FichaPaciente {
			String Nome;
			String sexo;
			int idade;
			double peso;
			int altura;
			String endereço;
			int Telefone;
			int pressaoArterial1;
			int pressaoArterial2;
			int Glicose;
			
			public FichaPaciente(String n,String sexo2,int id, double p, int alt, String end, int tel, int PA1, int PA2, int glc) {
				
				this.Nome= n;
				this.sexo=sexo2;
				this.idade=id;
				this.peso=p;
				this.altura=alt;
				this.endereço=end;
				this.Telefone=tel;
				this.pressaoArterial1=PA1;
				this.pressaoArterial2=PA2;
				this.Glicose=glc;
				
			}
			
			public void ImprimirInfo() {
				 System.out.println("O nome do paciente: "+Nome);
				 System.out.println("Idade: "+idade+ " anos");
				 System.out.println("Peso: "+peso+" kgs");
				 System.out.println("Altura:"+altura+" cms");
				 System.out.println("Endereço: "+endereço);
				 System.out.println("Telefone: "+Telefone);
				 System.out.println("Pressão Arterial: "+pressaoArterial1+ "/" +pressaoArterial2+" mm Hg");
				 System.out.println("Glicose: "+Glicose+" mg/dl");
				 
			}

			public String getSexo() {
				return sexo;
			}

			public void setSexo(String sexo) {
				this.sexo = sexo;
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

			public double getPeso() {
				return peso;
			}

			public void setPeso(int peso) {
				this.peso = peso;
			}

			public int getAltura() {
				return altura;
			}

			public void setAltura(int altura) {
				this.altura = altura;
			}

			public String getEndereço() {
				return endereço;
			}

			public void setEndereço(String endereço) {
				this.endereço = endereço;
			}

			public int getTelefone() {
				return Telefone;
			}

			public void setTelefone(int telefone) {
				Telefone = telefone;
			}

			public int getPressaoArterial1() {
				return pressaoArterial1;
			}

			public void setPressaoArterial1(int pressaoArterial1) {
				this.pressaoArterial1 = pressaoArterial1;
			}

			public int getPressaoArterial2() {
				return pressaoArterial2;
			}

			public void setPressaoArterial2(int pressaoArterial2) {
				this.pressaoArterial2 = pressaoArterial2;
			}

			public int getGlicose() {
				return Glicose;
			}

			public void setGlicose(int glicose) {
				Glicose = glicose;
			}
			
			
			
			
}
