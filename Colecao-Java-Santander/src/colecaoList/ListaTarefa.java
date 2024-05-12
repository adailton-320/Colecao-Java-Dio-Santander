package colecaoList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa>tarefaRemover= new ArrayList<Tarefa>();
		 
		for ( Tarefa t : tarefaList) {
			
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				
				tarefaRemover.add(t);
				
			}
			tarefaList.removeAll(tarefaRemover);
		}
	}
	
	public int obterTotalTarefa() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefa() {
		System.out.println(tarefaList	);
	}
	
	

}
