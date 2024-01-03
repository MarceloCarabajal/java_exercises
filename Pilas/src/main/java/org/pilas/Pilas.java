package org.pilas;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("lista vacia: " + pila);
        System.out.println("lista está vacia? "+ pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for (Integer pilita: pila){
            System.out.println(pilita);
        }

        //mostrar
        System.out.println("pila: "+pila);
        System.out.println("pila vacia? "+pila.isEmpty());

        //eliminar el ultimo registro que entró
        pila.pop();
        System.out.println("Esta el 3? " +pila.search(3));
        System.out.println("ultimo agregado: "+pila.peek());
    }
}