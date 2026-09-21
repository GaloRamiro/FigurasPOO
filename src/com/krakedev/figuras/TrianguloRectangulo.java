package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {

	private int catetoA;
	private int catetoB;
	private double hipotenusa;

	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;

		this.hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
	}

	@Override
	public int calcularPerimetro() {
		return (int) (catetoA + catetoB + hipotenusa);
	}

	@Override
	public int calcularArea() {
		return (catetoA * catetoB) / 2;
	}

	public int getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}

	public int getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}
}