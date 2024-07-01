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
}
