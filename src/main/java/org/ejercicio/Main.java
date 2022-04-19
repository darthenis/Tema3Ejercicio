package org.ejercicio;

public class Main {
    public static void main(String[] args) {

        int resultado = suma(5, 10, 21);

        System.out.println(resultado);

        Coche coche = new Coche();

        coche.aumentarPuertas();

        int numPuertas = coche.getNumPuertas();

        System.out.println(numPuertas);
    }

    public static int suma(int a, int b, int c){

        return a + b + c;

    }

}


