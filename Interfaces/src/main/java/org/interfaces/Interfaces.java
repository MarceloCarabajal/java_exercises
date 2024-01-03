package org.interfaces;

public class Interfaces {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(4);

        double v = c2.calcularArea();

        System.out.println("calculo area circulo: "+v);
    }
}