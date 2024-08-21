package com.mycompany.main;

public class VerificadorExpressao {

    public static boolean verificarExpressao(String expressao) {
        PilhaDinamicaDuplamenteEncadeada<Character> pilha = new PilhaDinamicaDuplamenteEncadeada<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            // Se o caractere for um abre parênteses, colchete ou chave, empilha
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } // Se o caractere for um fecha parênteses, colchete ou chave
            else if (caractere == ')' || caractere == ']' || caractere == '}') {
                // Verifica se a pilha está vazia (ou seja, tem um fecha sem um abre correspondente)
                if (pilha.isEmpty()) {
                    return false;
                }

                // Desempilha e verifica se o topo da pilha corresponde ao tipo de parênteses correto
                char topo = pilha.pop();
                if ((caractere == ')' && topo != '(')
                        || (caractere == ']' && topo != '[')
                        || (caractere == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        // Se a pilha não estiver vazia ao final, significa que há parênteses não fechados
        return pilha.isEmpty();
    }
}
