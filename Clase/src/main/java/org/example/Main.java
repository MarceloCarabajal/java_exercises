package org.example;

import logica.Alumno;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Marcelo", "Carabajal");
        System.out.println("El id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());
        System.out.println("------------------------");

        alu1.setId(4);
        alu1.setNombre("Mercedes");
        alu1.setApellido("Leguizamon");

        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre());
        System.out.println("El apellido es: "+ alu1.getApellido());
        System.out.println("------------------------");

        alu2.setId(35);

        System.out.println("El id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());
    }
}