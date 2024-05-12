package desafio5;

import java.util.Scanner;

public class ControleDeSaque {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 

	        double limiteDiario = scanner.nextDouble();
	        double saque = 0.0;
	       
	        while (scanner.hasNext()) {
	            saque = scanner.nextDouble();
	            if (saque == 0 ) {
	                System.out.println("Transacoes encerradas.");
	                return;
	            }

	            if (saque <= limiteDiario) {
	                limiteDiario -= saque;
	                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
	            }else {
	                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
	            }

	        }
	        scanner.close(); 
	    }
	}


