/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahum
 */
public class Queue<T> {
    
    Node<T> Front;
    Node<T> Tail;
    int size;
    
    public Queue(){
        this.Front=null;
        this.Tail=null;
        this.size=0;
    }
    public boolean isEmpty(){
        return this.Front==null;
    }
public void enqueue(T data) {
    Node<T> nodeToInsert = new Node<>(data);

    if (this.isEmpty()) {
        this.Front = nodeToInsert;
        this.Tail = nodeToInsert;
    } else {
        // Enlaza el nuevo nodo al final de la cola
        this.Tail.setNext(nodeToInsert);
        this.Tail = nodeToInsert;
    }
    this.size++;
        
    }
        
    public T dequeue(){
        
        if (this.isEmpty())
            return null;
        T result=this.Front.getData();
        Front = Front.getNext();
        
        return result;
    }
    public T peek(){
        return Front.getData();
    }
    
    public int size(){
        return this.size;
    }
    
    @Override
public String toString() {
    if (isEmpty()) {
        return "[]";
    }

    StringBuilder sb = new StringBuilder("[");
    Node<T> current = this.Front;

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


