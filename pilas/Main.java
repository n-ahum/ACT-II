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
        Stack<Object> myStack = new Stack<>();
        
        System.out.println("Agregando Elementos...");
        myStack.push(10);
        myStack.push(20);
        myStack.push(50);
        myStack.push(30);  

        System.out.println("pila: " + myStack);

        while (!myStack.isEmpty()) {
            Object elem = myStack.pop();
            System.out.println("atendiendo elemento de la pila: " + elem);
        }

        System.out.println("pila: " + myStack);
    }
}