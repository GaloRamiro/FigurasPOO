package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 4, 6);

        System.out.println("Perimetro del cuadrado: "
                + cuadrado.calcularPerimetro());

        System.out.println("Perimetro del rectangulo: "
                + rectangulo.calcularPerimetro());

        Figura figura1 = new Cuadrado("Cuadrado", "Rojo", 5);
        Figura figura2 = new Rectangulo("Rectangulo", "Azul", 4, 6);

        System.out.println("Polimorfismo cuadrado: "
                + figura1.calcularPerimetro());

        System.out.println("Polimorfismo rectangulo: "
                + figura2.calcularPerimetro());
    }
}