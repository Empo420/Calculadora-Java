package interfaz;

import mundo.Calculadora;

public class interfaz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double one = 5.0;
		double two = 5.0;
		
		Calculadora calculadora = new Calculadora(one, two);
		
		double suma = calculadora.suma();
		double resta = calculadora.resta();
		double division = calculadora.division();
		double multiplicacion = calculadora.multiplicacion();
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La division es: " + division);
		System.out.println("La multiplicacion es: " + multiplicacion);
	}
	
}
