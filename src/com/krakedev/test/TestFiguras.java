package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

    public static void main(String[] args) {

        Figura figura = new Figura();
        figura.setNombre("Figura");
        figura.setColor("Verde");

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNombre("Cuadrado");
        cuadrado.setColor("Rojo");

        Triangulo triangulo = new Triangulo();
        triangulo.setNombre("Triangulo");
        triangulo.setColor("Azul");

        System.out.println(figura);
        System.out.println(cuadrado);
        System.out.println(triangulo);
    }
}