package colecaoList.pesquisaLivro;

public class Livro {
	
	private String nomeLivro;
	private String autorLivro;
	private int anoLancamento;
	
	
	
	public Livro(String nomeLivro, String autorLivro, int anoLancamento) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.anoLancamento = anoLancamento;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", autorLivro=" + autorLivro + ", anoLancamento=" + anoLancamento
				+ "]";
	}
	
	
	
	
	

}
