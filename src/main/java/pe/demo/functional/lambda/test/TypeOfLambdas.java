package pe.demo.functional.lambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import pe.demo.functional.beans.Direccion;
import pe.demo.functional.beans.Persona;

public class TypeOfLambdas {
	
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();		
	      listaPersonas.add(new Persona("Jose", "Guerrero", 10, new Direccion("Lima")));
	      listaPersonas.add(new Persona("Luis", "Torres", 15, new Direccion("Piura")));
	      listaPersonas.add(new Persona("Juan", "Andrade", 12,new Direccion("Trujillo")));
	      listaPersonas.add(new Persona("Pedro", "Olguin", 17,new Direccion("Arequipa")));
	      listaPersonas.add(new Persona("Fidel", "Guevara", 8,new Direccion("Tacna")));
	      listaPersonas.add(new Persona("Paul", "Narvaez", 5,new Direccion("Ayacucho")));
	      
	      //Predicate<Tipo>
	      //predicado: obtiene le número de usuarios con edad mayor >12 años
	      System.out.println("Ejemplo de predicado:");
	      System.out.println("Usuarios mayores a 12 años: "+listaPersonas.stream().filter(x->x.getEdad()>12 ).count());
	      
	      
	      //Function<T,R>
	      //Funcion: Obtiene la dirección que corresponde a la persona de la posición 0 de la lista
	      System.out.println("\nEjemplo de función:");
	      Function<Persona,Direccion> funDireccion= v->v.getDir();
	      System.out.println(funDireccion.apply(listaPersonas.get(0)).getNombre());
	      
	      
	      //Consumer<Tipo>
	      //ejemplo consumidor: aceptamos y consumimos el comportamiento
	      System.out.println("\nEjemplo de consumidor:");
	      Consumer<Persona> cambiaApellido = u->u.setApellido("Aguirre Cambiado");
	      cambiaApellido.accept(listaPersonas.get(0));
	      listaPersonas.forEach(System.out::println);
	      
	      //Supplier<Tipo>
	      //proveedor: Crea un nuevo usuario y nos provee dicho objeto
	      System.out.println("\nEjemplo de proveedor:");
	      Supplier<Persona> u=()->new Persona("Augusto", "Velez", 5,new Direccion("Madre de Dios"));
	      System.out.println(u.get());	
		
	}
}
