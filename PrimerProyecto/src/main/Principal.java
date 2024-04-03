package main;
import main.model.domain.Calculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora calcuUno = new Calculadora();
		calcuUno.prenderCalculadora();
		
		int numero = 10;
		int resultadoSuma = calcuUno.sumar(5, numero);
		System.out.println("El resultado de la suma es "+resultadoSuma);
	}

}
