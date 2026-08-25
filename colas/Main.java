/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahum
 */
public class Main {
    public static void main(String[] args) {
        Queue<Object> myQueue = new Queue<>();

        System.out.println("Agregando Elementos...");
        myQueue.enqueue(300); 
        myQueue.enqueue(100);  
        myQueue.enqueue(600);  

        System.out.println("cola: " + myQueue);

        while (!myQueue.isEmpty()) {
            Object elem = myQueue.dequeue();
            System.out.println("atendiendo elemento de la cola: " + elem);
        }

        System.out.println("cola: " + myQueue);
    }
}