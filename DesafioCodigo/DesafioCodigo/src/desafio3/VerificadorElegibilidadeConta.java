package desafio3;

import java.util.Scanner;

//Aqui � definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta { 

 public static void main(String[] args) { 
     Scanner scanner = new Scanner(System.in); 

     int idade = scanner.nextInt(); 

//TODO: Verifique se a idade � maior ou igual a 18 e imprima uma mensagem informando que o usu�rio � eleg�vel para criar uma conta banc�ria:
    if(idade >= 18){
      System.out.println("Voce esta elegivel para criar uma conta bancaria.");
      
    }else{
      
      System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
      
    }

//Fechamos o objeto Scanner para liberar os recursos:
     scanner.close(); 
 }
}
