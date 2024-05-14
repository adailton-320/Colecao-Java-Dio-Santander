package colecaoList.pesquisaLivro;

public class TesteMainLivros {

	public static void main(String[] args) {
		
		CatalogoLivros biblioteca= new CatalogoLivros();
		
		biblioteca.adicionarLivro("livro1", "autor1", 2000);
		biblioteca.adicionarLivro("livro2", "autor3", 2015);
		biblioteca.adicionarLivro("livro3", "autor2", 2016);
		biblioteca.adicionarLivro("livro4", "autor1", 2020);
		biblioteca.adicionarLivro("livro5", "autor5", 2024);
		
		System.out.println(biblioteca.pesquisarAutor("autor1"));

	}

}
