package colecaoList.pesquisaLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livros;

	public CatalogoLivros() {
		
		this.livros = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String nomeLivro, String autorLivro, int anoLancamento) {
		livros.add(new Livro(nomeLivro, autorLivro, anoLancamento));
	}
	
	public List<Livro> pesquisarAutor(String autorLivro ){
		List<Livro> livrosPorAutor= new ArrayList<Livro>();
		if(!livros.isEmpty()) {
			for(Livro l : livros) {
				if(l.getAutorLivro().equalsIgnoreCase(autorLivro)) {
					livrosPorAutor.add(l);
				}
				
			}
		}
		
		return livrosPorAutor;
		
	}
	
	public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAno= new ArrayList<Livro>();
		if(!livros.isEmpty()) {
			for (Livro l: livros) {
				if(l.getAnoLancamento()>= anoInicial &&  l.getAnoLancamento() <= anoFinal ) {
					livrosPorIntervaloAno.add(l);
				}
			}
		}
		
		return livrosPorIntervaloAno;
	}
	
	public Livro pesquisarTituloLivro(String titulo) {
		Livro tituloLivro= null;
		
		if(!livros.isEmpty()) {
			for (Livro l : livros) {
				if(l.getNomeLivro().equalsIgnoreCase(titulo)) {
					
					tituloLivro= l;
					break;
					
				}
			}
		}
		
		return tituloLivro;
	}

}
