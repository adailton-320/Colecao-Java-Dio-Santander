package desafio2;

import java.util.Scanner;

public class VerificadorNumeroConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String numeroConta = scanner.nextLine();

// TODO: Inicialize um bloco try-catch para capturar exce��es:
		try {
			verificarNumeroConta(numeroConta);
			System.out.println("Numero de conta valido.");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

// Declara��o do m�todo verificarNumeroConta, que verifica se o n�mero de conta tem exatamente 8 d�gitos:
	private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

		if (numeroConta.length() < 8 || numeroConta.length() > 8) {

			throw new IllegalArgumentException(" Numero de conta invalido. Digite exatamente 8 digitos.");

		}
	}
}
