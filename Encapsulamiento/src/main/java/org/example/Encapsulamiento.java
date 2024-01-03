package org.example;

import encapsulamiento.Alumno;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(1, "Jose", "Soria");

        System.out.println("id: "+alu2.getId());
        System.out.println("nombre: "+alu2.getNombre());
        System.out.println("apellido: "+alu2.getApellido());
    }
}