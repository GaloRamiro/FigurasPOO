package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

    public static void main(String[] args) {

        Graficador graficador = new Graficador();

        Figura figura = new Figura("Figura", "Verde");

        Cuadrado cuadrado = new Cuadrado(
                "Cuadrado",
                "Rojo",
                5
        );

        Rectangulo rectangulo = new Rectangulo(
                "Rectangulo",
                "Azul",
                4,
                6
        );

        TrianguloRectangulo triangulo = new TrianguloRectangulo(
                "Triangulo Rectangulo",
                "Amarillo",
                3,
                4
        );

        graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);
    }
}