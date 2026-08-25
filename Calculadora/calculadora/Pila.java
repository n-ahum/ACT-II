/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author nahum
 */
public class Pila {
    private Nodo top;

    public Pila() {
        this.top = null;
    }

    public boolean estaVacia() {
        return top == null;
    }

    public void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = top;
        top = nuevo;
    }

    public char pop() {
        if (estaVacia()) {
            return '\0';
        }
        char dato = top.dato;
        top = top.siguiente;
        return dato;
    }

    public char peek() {
        if (estaVacia()) {
            return '\0';
        }
        return top.dato;
    }
}