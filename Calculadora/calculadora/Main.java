/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
//no usar util nistrings, unicamente se podra usar ToString
/**
 *
 * @author nahum
 */
public class Main {

    // Comprueba si el carácter es un número del 0 al 9
    static boolean es_numero(char data) {
        return data >= '0' && data <= '9';
    }

    // Devuelve el peso del operador en la Expresión/Lista de entrada
    static int peso_expresion(char operador) {
        switch (operador) {
            case '(': return 5;
            case '^': return 4;
            case '*': 
            case '/': return 2;
            case '+': 
            case '-': return 1;
            default:  return 0;
        }
    }

    // Devuelve el peso del operador dentro de la Pila
    static int peso_pila(char operador) {
        switch (operador) {
            case '^': return 3;
            case '*': 
            case '/': return 2;
            case '+': 
            case '-': return 1;
            case '(': return 0;
            default:  return 0;
        }
    }

    public static void main(String[] args) {
        char[] exp_in = {'2', '+', '3', '*', '4'};

        // Estructuras de datos
        ListaLigada exp_final = new ListaLigada();
        Pila tmp = new Pila();

        // Algoritmo de conversión
        for (int i = 0; i < exp_in.length; i++) {
            char c = exp_in[i];

            if (es_numero(c)) {
                // 1. Si es operando, se agrega directamente a la lista final
                exp_final.agregar(c);
            } else if (c == ')') {
                // 2. Si es ')', desapilar hasta encontrar '('
                while (!tmp.estaVacia() && tmp.peek() != '(') {
                    exp_final.agregar(tmp.pop());
                }
                tmp.pop(); // Eliminar '(' de la pila sin agregarlo a la lista final
            } else {
                // 3. Si es operador (+, -, *, /, ^, ()
                while (!tmp.estaVacia() && peso_expresion(c) <= peso_pila(tmp.peek())) {
                    exp_final.agregar(tmp.pop());
                }
                tmp.push(c);
            }
        }

        // 4. Vaciar operadores restantes en la pila
        while (!tmp.estaVacia()) {
            exp_final.agregar(tmp.pop());
        }

        // Mostrar resultado
        System.out.print("Postfija: ");
        exp_final.mostrar();
    }
}