package desafio1;

import java.util.Scanner;

public class SimulacaoBancaria {
	static double saldo = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		// Loop infinito para manter o programa em execução até que o usuário decida
		// sair
		while (true) {
			int opcao = scanner.nextInt();
			// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
			// Dica: Utilze o switch/case para o programa realizar as operações escolhidas
			// pelo usuário.
			switch (opcao) {
			case 1:
				depositar(scanner);
				consultar();

				break;
			case 2:
				sacar(scanner);

				break;
			case 3:

				consultar();

				break;

			case 0:
				System.out.println("Programa encerrado.");
				return;

			// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}

		}

	}

	private static double depositar(Scanner scanner) {
		
		System.out.println("Valor deposito ");

		double deposito = scanner.nextDouble();
		saldo = saldo + deposito;
		System.out.println("Deposito realizado com sucesso");

		return saldo;

	}

	private static void sacar(Scanner scanner) {
		
		System.out.println("Valor saque ");
		double saque = scanner.nextDouble();
		if (saque > saldo) {
			System.out.println("Saldo insuficiente.");

		} else {
			saldo = saldo - saque;
			System.out.println("Saque realizado com sucesso");
		}
	}

	private static void consultar() {

		System.out.println("Saldo atual: " + saldo);

	}

}
