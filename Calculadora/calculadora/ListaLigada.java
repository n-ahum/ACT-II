/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author nahum
 */
public class ListaLigada {
    Nodo head;
    Nodo cola;

    public ListaLigada() {
        this.head = null;
        this.cola = null;
    }

    public void agregar(char dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) {
            head = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}