package main.model.domain;

public class Calculadora {

	public Calculadora() {
		System.out.println("Se ha creado el objeto");
	}
	
	public void prenderCalculadora() {
		System.out.println("Se ha prendido la calculadora");
	}
	
	public int sumar(int numA, int numB) {
		return numA+numB;
	}
}

