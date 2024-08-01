package com.mycompany.contabanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);
     
     System.out.print("Digite seu nome: ");
     String Nome_Client = leitor.next();
     
     System.out.print("Digite o número da sua conta: ");
     int numero = leitor.nextInt();
     
     System.out.print("Digite sua Agência: ");
     String Agencia = leitor.next();
     
     System.out.print("Digite seu saldo atual: ");
     double Saldo = leitor.nextDouble();
     
     System.out.print("Olá " + Nome_Client + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + numero +  " e seu saldo " + Saldo + " já está disponível para saque");
    
    }
}
