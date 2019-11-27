package pe.demo.functional.interfaz;

//anotación opcional. no es necesaria
@FunctionalInterface
public interface IFuncionLambda {
	
	//Se tiene sólo un método abstracto
	
	//método abstracto para sumar 2 números, se implementará a partir de una expresión Lambda
	public void suma(int a, int b);
		
}