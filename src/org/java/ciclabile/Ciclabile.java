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

	// getElementoSuccessivo method
	public int getElementoSuccessivo() {
		this.elementoCorrente ++;
		return interi[this.elementoCorrente - 1];
	}
}
