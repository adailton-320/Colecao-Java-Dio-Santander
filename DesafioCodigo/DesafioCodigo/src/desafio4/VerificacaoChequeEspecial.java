package desafio4;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe seu saldo");
		double saldo = scanner.nextDouble();

		System.out.println("Informe valor do saque");
		double saque = scanner.nextDouble();

		double limiteChequeEspecial = 500;

		// TODO: Verifique se o saque n�o ultrapassa o saldo dispon�vel na conta:
		if (saque <= saldo) {
			System.out.println("Transa��o realizada com sucesso.");

		} else { 
			
			if (saque <=  saldo+ limiteChequeEspecial) {
			   System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");

			}else{
				
				System.out.println("Transa��o n�o realizada. Limite do cheque especial excedido.");
			}
		} 

		// TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas n�o o
		// saldo total dispon�vel:

		// Se o saque ultrapassar tanto o saldo dispon�vel quanto o limite do cheque
		// especial
		// System.out.println("Transacao nao realizada. Limite do cheque especial
		// excedido.");

// Fechamos o objeto Scanner para liberar os recursos:
		scanner.close();
	}
}