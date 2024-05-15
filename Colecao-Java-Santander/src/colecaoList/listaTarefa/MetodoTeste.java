package colecaoList.listaTarefa;

public class MetodoTeste {

	public static void main(String[] args) {

		ListaTarefa minhasTarefas = new ListaTarefa();
		
		minhasTarefas.adicionarTarefa("Tarefa do dia");
		minhasTarefas.adicionarTarefa("Tarefa noturna");
		minhasTarefas.adicionarTarefa("Tarefa extra");
		
		minhasTarefas.obterTotalTarefa();
		minhasTarefas.obterDescricaoTarefa();

	}

}
