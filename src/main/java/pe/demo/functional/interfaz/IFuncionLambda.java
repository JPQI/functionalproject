package pe.demo.functional.interfaz;

//anotaci�n opcional. no es necesaria
@FunctionalInterface
public interface IFuncionLambda {
	
	//Se tiene s�lo un m�todo abstracto
	
	//m�todo abstracto para sumar 2 n�meros, se implementar� a partir de una expresi�n Lambda
	public void suma(int a, int b);
		
}