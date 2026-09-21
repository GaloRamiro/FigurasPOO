package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestFiguras {

    public static void main(String[] args) {

        Figura figura = new Cuadrado(
                "Cuadrado",
                "Verde",
                5
        );

        Cuadrado cuadrado = new Cuadrado(
                "Cuadrado",
                "Rojo",
                5
        );

        TrianguloRectangulo triangulo = new TrianguloRectangulo(
                "Triangulo Rectangulo",
                "Azul",
                3,
                4
        );

        System.out.println(figura);
        System.out.println(cuadrado);
        System.out.println(triangulo);
    }
}