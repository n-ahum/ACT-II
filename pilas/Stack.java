/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahum
 */
public class Stack<T> {
    
    private Node<T> top;
    private int size;
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return this.top == null;
    }
    
    // Equivale a enqueue: inserta en la cima de la pila (LIFO)
    public void push(T data) {
        Node<T> nodeToInsert = new Node<>(data);
        nodeToInsert.setNext(this.top);
        this.top = nodeToInsert;
        this.size++;
    }
        
    // Equivale a dequeue/pop: remueve y retorna el elemento superior
    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        T result = this.top.getData();
        this.top = this.top.getNext();
        this.size--;
        return result;
    }
    
    // Retorna el elemento en la cima sin removerlo
    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.top.getData();
    }
    
    public int size() {
        return this.size;
    }
    
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = this.top;

        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        sb.append("]");
        return sb.toString();
    }
}