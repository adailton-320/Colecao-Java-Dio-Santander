package desafio1;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        // Loop infinito para manter o programa em execu��o at� que o usu�rio decida sair
        while (true) { 

            int opcao = scanner.nextInt();
           
        // TODO: Implemente as condi��es necess�rias para avaliaa a' op��o escolhida:
        // Dica: Utilze o switch/case para o programa realizar as opera��es escolhidas pelo usu�rio.
          switch(opcao){
            case 1:
              double deposito= scanner.nextDouble();
              saldo= saldo + deposito;
              System.out.println("Saldo atual: " + saldo);
              break;
            
            case 2:
              double saque= scanner.nextDouble();
              if(saldo >= saque){
                
                saldo-= saque;
                System.out.println("Saldo atual: " + saldo);
                
              }else{
                System.out.println("Saldo insuficiente. ");
              }
              break;
              
            case 3:
              System.out.println("Saldo atual: " + saldo);
              break;
              
            case 0:
              System.out.println("Programa encerrado.");
              break;
        // Exibe mensagem de op��o inv�lida se o usu�rio escolher uma op��o inv�lida:    
                default:
                    System.out.println("Op��o inv�lida. Tente novamente."); 
            
          }  
        }
    }
}
