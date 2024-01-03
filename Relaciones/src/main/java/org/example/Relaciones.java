package org.example;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Peugeot");
        aut.setModelo("307");

        List<Propietario> listaProp = new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(35L);
        prop1.setNombre("Marce");
        prop1.setApellido("Carabajal");

        prop2.setId(23L);
        prop2.setNombre("Franco");
        prop2.setApellido("Sanchez");


        listaProp.add(prop1);
        listaProp.add(prop2);

        aut.setListaPropietarios(listaProp);

        System.out.println("El auto: "+aut.getMarca() + " " + aut.getModelo() +
                " tiene como propietarios: " + aut.getListaPropietarios().toString());

    }
}