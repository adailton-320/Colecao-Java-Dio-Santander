package colecaoList.carrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	
	List<Item> itemList;

	public CarrinhoDeCompra() {
		
		this.itemList = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, int quantidade, double preco ) {
		
		itemList.add(new Item(nome, quantidade, preco));
		
	}
	
	public void adicionarItemTeste(String nome, int quantidade, double preco) {
		
		Item item= new Item(nome, quantidade, preco);
		itemList.add(item);
		
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover= new ArrayList<Item>();
		if(!itemList.isEmpty()) {
			for (Item i : itemList) {
				
				if(i.getNome().equalsIgnoreCase(nome));
				itensParaRemover.add(i);
				
			}
			itemList.removeAll(itensParaRemover);
			
		}else {
			System.out.println("Carrinho vazio!!");
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal= 0;
		if(!itemList.isEmpty()) {
			for (Item i : itemList) {
				double valorItem= i.getPreco()* i.getQuant();
				valorTotal= valorTotal + valorItem;
			}
			
		}else {
			System.out.println("Carrinho vazio!!");
		}
		return valorTotal;
	}
	
	public void exibirCarrinho(){
		
		if(!itemList.isEmpty()) {
			System.out.println(itemList);
			
		}else {
			System.out.println("Carrinho vazio!!");
		}
	}

}
