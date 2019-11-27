package pe.demo.functional.lambda.test;

import pe.demo.functional.interfaz.IFuncionLambda;

public class TestLambdas {

	public static void main(String[] args) {
		 
		int x = 20;
		int y = 2;
		
		//se implementa el método de la interfaz con una expresión lambda
		IFuncionLambda iflambda = (a, b) -> {
			System.out.println(a + b);
		};
		//se invoca el método con la implementación ingresando los parámetros
		iflambda.suma(x, y);
	}
}
