package colecaoList.carrinhoCompra;

public class TesteCarrinhoCompra {

	public static void main(String[] args) {
		CarrinhoDeCompra cliente1 = new CarrinhoDeCompra();
		
		cliente1.adicionarItem("memoria 8gb", 2, 150.00);
		cliente1.adicionarItem("placa mae", 1, 500.00);
		cliente1.adicionarItem("processador", 1, 1000.00);
		cliente1.adicionarItem("ssd", 1, 200.00);
		
		cliente1.exibirCarrinho();
		
		System.out.println(cliente1.calcularValorTotal());
		cliente1.removerItem("ssd");
		
		cliente1.exibirCarrinho();
		
		System.out.println(cliente1.calcularValorTotal());

	}

}
