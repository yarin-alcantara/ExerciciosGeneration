package CofreFinal;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
private	List<Livro> listaDeLivros;	
	
	public Biblioteca() {
		
		this.listaDeLivros = new ArrayList<Livro>();
		
	}
	
	public void doarLivro(Livro livro) {
		this.listaDeLivros.add(livro);
		
	}
	
	public boolean adotarLivro(int id) {
		Livro livro = obterLivro(id);
		
		if (livro == null) { // Livro não encontrado
			return false;
			
		} else { // Livro Existe
			this.listaDeLivros.remove(livro);
			
			return true;
		}
		
	}
	
	public Livro obterLivro(int id) {
		for(Livro livro : this.listaDeLivros) {
			if(livro.getId() ==  id) {
				return livro;
			}
		}
		
		return null;	
	}
	
	public List<Livro> quaisLivrosContemNaBiblioteca() {
		return this.listaDeLivros;
	}

	public List<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	public void setListaDeLivros(List<Livro> listaDeLivros) {
		this.listaDeLivros = listaDeLivros;
	}
	
}
