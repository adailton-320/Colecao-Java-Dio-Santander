package desafio5;

import java.util.Scanner;

public class SaqueConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        double totalSaque = 0;

        while (true) {
            System.out.println("Informe o valor do saque:");
            double valorSaque = scanner.nextDouble();

            if (valorSaque > limiteDiario) {
                System.out.println("O valor do saque ultrapassa o limite diário!");
                break;
            }

            if (totalSaque + valorSaque > limiteDiario) {
                System.out.println("O limite diário de saque foi atingido!");
                break;
            }

            totalSaque += valorSaque;
            System.out.println("Saque realizado com sucesso. Total sacado: " + totalSaque);

            System.out.println("Deseja fazer outro saque? (s/n)");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Encerrando programa...");
        scanner.close();
    }
}