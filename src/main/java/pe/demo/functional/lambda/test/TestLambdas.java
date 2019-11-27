package pe.demo.functional.lambda.test;

import pe.demo.functional.interfaz.IFuncionLambda;

public class TestLambdas {

	public static void main(String[] args) {
		 
		int x = 20;
		int y = 2;
		
		//se implementa el m�todo de la interfaz con una expresi�n lambda
		IFuncionLambda iflambda = (a, b) -> {
			System.out.println(a + b);
		};
		//se invoca el m�todo con la implementaci�n ingresando los par�metros
		iflambda.suma(x, y);
	}
}
