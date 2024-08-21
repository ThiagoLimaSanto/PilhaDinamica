
package com.mycompany.main;

public class PilhaDinamicaDuplamenteEncadeada<T> {
    private Node<T> top; // Topo da pilha
    private int size;    // Tamanho da pilha

    public PilhaDinamicaDuplamenteEncadeada() {
        this.top = null;
        this.size = 0;
    }

    // Método para empilhar um elemento
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.prev = top;
            top.next = newNode;
            top = newNode;
        }
        size++;
    }

    // Método para desempilhar um elemento
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha está vazia.");
        }
        T data = top.data;
        top = top.prev;
        if (top != null) {
            top.next = null;
        }
        size--;
        return data;
    }

    // Método para verificar o elemento no topo da pilha
    public T peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        }
        return top.data;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obter o tamanho da pilha
    public int size() {
        return size;
    }
}