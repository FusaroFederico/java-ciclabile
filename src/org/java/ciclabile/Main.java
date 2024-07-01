package org.java.ciclabile;

public class Main {

	public static void main(String[] args) {
		int[] pluto = {1, 2, 3, 4, 5};
		Ciclabile pippo = new Ciclabile(pluto);
		System.out.println(pippo.hasAncoraElementi());
		System.out.println(pippo.getElementoSuccessivo());
		System.out.println(pippo.hasAncoraElementi());
		System.out.println(pippo.getElementoSuccessivo());
		System.out.println(pippo.hasAncoraElementi());
		System.out.println(pippo.getElementoSuccessivo());
		System.out.println(pippo.hasAncoraElementi());
		System.out.println(pippo.getElementoSuccessivo());
		System.out.println(pippo.hasAncoraElementi());
		System.out.println(pippo.getElementoSuccessivo());
		System.out.println(pippo.hasAncoraElementi());
		
		System.out.println(pippo.getElementoCorrente());
		System.out.println("----------------------------------------------");
		
		Ciclabile paperino = new Ciclabile();
		paperino.addElemento(8);
		paperino.addElemento(4);
		paperino.addElemento(11);
		System.out.println(paperino.getElementoSuccessivo());
		System.out.println(paperino.getElementoSuccessivo());
		System.out.println(paperino.getElementoSuccessivo());
		System.out.println(paperino.hasAncoraElementi());
		paperino.resetElementoCorrente();
		System.out.println(paperino.hasAncoraElementi());
		System.out.println(paperino.getElementoCorrente());
	}

}
