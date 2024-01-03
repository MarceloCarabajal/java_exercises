package org.example;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(1523, "Jorge");
        mapaEmpleados.put(1524, "Mercedes");
        mapaEmpleados.put(1525, "Martin");
        mapaEmpleados.put(1527, "Hola");
        mapaEmpleados.put(1528, "Diego");

        boolean estaono = mapaEmpleados.containsValue("Jorge");
        if(estaono == true){
            System.out.println("Esta en el listado");
        }
        else {
            System.out.println("No está en el listado");
        }

        boolean estaono2 = mapaEmpleados.containsKey(1523);
        if(estaono2 == true){
            System.out.println("Esta en el listado");
        }
        else {
            System.out.println("No está en el listado");
        }


        System.out.println("Valores con map" +mapaEmpleados.values());
        System.out.println("Valores keys" +mapaEmpleados.keySet());

        String nombre = mapaEmpleados.get(1524);
        System.out.println("el empleado buscado es: "+nombre);

        mapaEmpleados.remove(1527);

        System.out.println("Valores luego del remove: "+mapaEmpleados.values());
    }

}