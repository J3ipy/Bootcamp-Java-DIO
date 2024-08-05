package com.mycompany.desafiocontrolefluxo;
import java.util.Scanner;

public class Contador_OK {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int p1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int p2 = terminal.nextInt();
        
        try{
            contar(p1, p2);
        }catch(ParametrosInvalidosException exepction){
            System.out.println(exepction.getMessage());
        }
    }
    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if(p1 > p2){
            throw new ParametrosInvalidosException("O segundo parametro é maior que o primeiro");
        }
        
        int contagem = p1 - p2;
        
        for(int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
