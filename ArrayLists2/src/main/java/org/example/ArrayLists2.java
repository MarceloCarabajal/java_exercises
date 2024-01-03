package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists2 {
    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Jose", 34));
        listaArray.add(new Persona(2, "Pepe", 45));
        listaArray.add(new Persona(3, "Pepito", 54));
        listaArray.add(new Persona(4, "Claus", 66));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Jose", 34));
        listaLinked.add(new Persona(2, "Pepe", 45));
        listaLinked.add(new Persona(3, "Pepito", 54));
        listaLinked.add(new Persona(4, "Claus", 66));

        System.out.println("---ArrayList---");
        for (Persona lisArray:listaArray){
            System.out.println("nombre: " + lisArray.getNombre());
        }

        System.out.println("---Luego del remove de ArrayList---");
        //Remove en ArrayList
        listaArray.remove(0);
        for (Persona persona:listaArray){
            System.out.println("nombre: " + persona.getNombre());
        }

        System.out.println("---LinkedList---");
        for (Persona persona2:listaLinked){
            System.out.println("nombre: " + persona2.getNombre());
        }

        //Remove en LinkedList
        String borrarPersona = "Jose";
        for(Persona persona2:listaLinked) {
            if (persona2.getNombre().equals(borrarPersona)) {
               listaLinked.remove(persona2);
               break;
            }
        }

        System.out.println("---Luego del remove de LinkedList---");
        for(Persona lisLinked:listaLinked){
            System.out.println("nombre: "+ lisLinked.getNombre());
        }

        //Tamaño de lista
        System.out.println("---tamaño de listas---");
        System.out.println("ArrayList: "+ listaArray.size());
        System.out.println("LinkedList: "+ listaLinked.size());

        //obtener primer objeto
        System.out.println("---primer y ultimo objeto (solo para linkedList)---");
        System.out.println("Primero de linkedList: "+ listaLinked.getFirst().toString());
        System.out.println("Ultimo de linkedlist: "+ listaLinked.getLast().toString());

        //borrar lista
        System.out.println("---Borrando lista---");
        listaArray.clear();
        listaLinked.clear();

        //comprobar si esta vacia
        System.out.println("---esta vacia alguna lista?---");
        System.out.println("ArrayList: "+ listaArray.isEmpty());
        System.out.println("LinkedList: "+ listaLinked.isEmpty());


    }
}