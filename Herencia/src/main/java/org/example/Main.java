package org.example;

import Herencia.Consultor;
import Herencia.Empleado;
import Herencia.Jefe;
import Herencia.Persona;

public class Main {

    public static void main(String[] args) {

        //Polimorfismo
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();

        Persona perso = new Persona();
        Consultor consul = new Consultor();

        //Herencia
        Empleado emp1 = new Empleado();
        emp1.setNombre("Ruben");
        emp1.setCargo("Mantenimiento");

        System.out.println("El empleado 1 se llama: "+emp1.getNombre());
        System.out.println("Cargo: "+emp1.getCargo());

        Consultor cons1 = new Consultor();
        cons1.setNombre("Carlos");
        cons1.setNum_consultor(1);

        System.out.println("El consultor 1 se llama: "+cons1.getNombre());
        System.out.println("Cargo: "+cons1.getNum_consultor());


    }
}