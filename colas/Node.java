/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahum
 */
public class Node<T> {
    
    private T data;
    private Node next;
    public Node(T data) { //constructor
        this.data = data;
    }
    
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }    
    public T getData() {
    return this.data;

    }
}

