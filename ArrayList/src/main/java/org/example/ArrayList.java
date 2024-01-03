package org.example;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<Persona> lista = new java.util.ArrayList<Persona>();
        lista.add(new Persona(1, "Jorge", 63));
        lista.add(new Persona(2, "Mercedes", 60));
        lista.add(new Persona(3, "Marcelo", 33));
        lista.add(new Persona(4, "Martin", 31));

        System.out.println("------------For------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nombre: " + lista.get(i).getNombre());
            System.out.println("Edad: " + lista.get(i).getEdad());
        }

        System.out.println("------------ForEach------------");
        for (Persona perso:lista) {
            System.out.println("Nombre: " + perso.getNombre());
            System.out.println("Edad: " + perso.getEdad());
        }
    }
}