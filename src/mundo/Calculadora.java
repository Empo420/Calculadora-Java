package mundo;

public class Calculadora {
	
	private double one;
	private double two;
	
	public Calculadora() {
		
	}
	
	
	public Calculadora(double one, double two) {
		this.one = one;
		this.two = two;
	}

	public double suma (){
		
		double resultado;
	
		resultado = this.one + this.two;
		return resultado;	
	}
	

	public double resta (){
		
		double resultado;
		
		resultado = this.one - this.two;
		return resultado;
	
	}

	public double multiplicacion (){
		
		double resultado;
		
		resultado = this.one * this.two;
		return resultado;
	}

	public double division (){
		
		double resultado;

		resultado = this.one / this.two;
		return resultado;
		
	}



	
}
