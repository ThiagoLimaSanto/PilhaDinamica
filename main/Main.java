package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão aritmética:");
        String expressao = scanner.nextLine();
        
        VerificadorExpressao verifica = new VerificadorExpressao();
        
        if (verifica.verificarExpressao(expressao)) {
            System.out.println("A expressão está correta.");
        } else {
            System.out.println("A expressão está incorreta.");
        }
    }
}
