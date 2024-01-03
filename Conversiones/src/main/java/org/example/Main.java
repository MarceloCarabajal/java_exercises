package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Conversion De Double a Int y Double----------");
        double num = 1.78;

        //casteo a entero
        int numInt = (int) num;

        //casteo a long
        long numLong = (long) num;

        System.out.println("double: "+ num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        System.out.println("----------De String a Int y Double----------");

        String cantidad = "15";
        String precio = "150.27";

        int cantInt = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);

        double total = cantInt * precioDouble;
        System.out.println("El valor total de la compra es: " + total);

        System.out.println("----------De Int/Double a String----------");

        int edad = 33;
        double estatura = 1.80;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad: " + edadString);
        System.out.println("Estatura: " + estaturaString);

    }
}