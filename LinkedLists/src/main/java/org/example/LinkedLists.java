package org.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        //Agregar personas al final de la lista
        lista.add(new Persona(1, "Jorge", 63));
        lista.add(new Persona(2, "Mercedes", 60));
        lista.add(new Persona(3, "Marcelo", 33));
        lista.add(new Persona(4, "Martin", 31));

        //Agregar personas al final de la lista (característica de LinkedList)
        lista.add(0, new Persona(5, "Simon", 7));
        lista.add(1, new Persona(6, "Zeus", 5));

        for (Persona perso:lista) {
            System.out.println("Nombre: " + perso.getNombre());
        }

    }
}