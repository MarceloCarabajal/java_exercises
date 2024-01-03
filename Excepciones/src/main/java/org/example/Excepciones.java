package org.example;

public class Excepciones {
    public static void main(String[] args) {
        try{
            int resultado = 3/0;
        }
        catch (Exception e) {
            System.out.println("No se puede dividir por 0");
        }

        int edades[] = {15,12,23,30};
        try {
            System.out.println("La edad de la posicion 4 es: " +edades[5]);
        }
        catch (Exception e) {
            System.out.println("Intentaste acceder a un índice que no existe");
        }


    }
}