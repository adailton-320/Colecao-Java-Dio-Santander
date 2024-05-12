package desafio5;

import java.util.Scanner;

public class ControleSimplesDeSaques {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe valor limite!!");
		double limiteDiario = scanner.nextDouble();

		System.out.println("Informe valor do saque");
		double valorSaque = scanner.nextDouble();

		for (int i = 0; i < limiteDiario; i++) {

			sacar(limiteDiario, valorSaque);
			break;

			/*if (valorSaque <= limiteDiario) {

				limiteDiario -= valorSaque;
				System.out.println("Saque realizado. Limite restante: " + limiteDiario);
				System.out.println("Transacoes encerradas.");
				break;

			}
			if (valorSaque > limiteDiario) {
				System.out.println("Limite diario de saque atingido.");
				System.out.println("Transacoes encerradas.");
				break;
			}*/

		}

		scanner.close();
	}
	
	 private static void sacar(double limiteDiario, double valorSaque) {
		 
			if (valorSaque <= limiteDiario) {

				limiteDiario -= valorSaque;
				System.out.println("Saque realizado. Limite restante: " + limiteDiario);
				System.out.println("Transacoes encerradas.");
			

			}
			if (valorSaque > limiteDiario) {
				System.out.println("Limite diario de saque atingido.");
				System.out.println("Transacoes encerradas.");
				
			}
		
	}

}
