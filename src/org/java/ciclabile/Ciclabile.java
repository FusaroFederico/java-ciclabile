package org.java.ciclabile;

public class Ciclabile {
	// attributi
	private int[] interi;
	private int elementoCorrente;
	
	// costruttore
	public Ciclabile(int[] interi) {
		this.interi = interi;
		this.elementoCorrente = 0;
	}
	public Ciclabile() {
		this.interi = new int[0];
		this.elementoCorrente = 0;
	}
	
	// getElementoSuccessivo
	public int getElementoSuccessivo() {
		this.elementoCorrente ++;
		return interi[this.elementoCorrente - 1];
	}
	
	// hasAncoraElementi
	public boolean hasAncoraElementi() {
		if (elementoCorrente < (interi.length - 1)) {
			return true;
		}
		return false;
	}
	
	// addElemento
	public void addElemento(int intero) {
		int[] arrayCopia = new int[this.interi.length + 1];
		for (int i = 0; i < interi.length; i++) {
			arrayCopia[i] = this.interi[i];
		}
		arrayCopia[this.interi.length] = intero;
		this.interi = arrayCopia;
	}
}
