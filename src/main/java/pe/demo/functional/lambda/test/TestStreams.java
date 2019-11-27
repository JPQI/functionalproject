package pe.demo.functional.lambda.test;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import pe.demo.functional.beans.Dish;
import pe.demo.functional.beans.DishType;

public class TestStreams {
	
	public static void main(String[] args) {
		
		List<Dish> menues = Arrays.asList(
				new Dish("chancho", 800, DishType.MEAT),
				new Dish("res", 700, DishType.MEAT),
				new Dish("pollo", 400, DishType.MEAT),
				new Dish("salmon", 450, DishType.FISH),
				new Dish("papas fritas", 530, DishType.OTHER),
				new Dish("arroz", 350, DishType.OTHER),
				new Dish("manzana", 100, DishType.OTHER),
				new Dish("pizza", 550, DishType.OTHER)
				);
		
		
		List<String> comidaEnBajaCalorias = menues.stream()
												  .filter(d -> d.getCalories()<400)
												  .sorted(comparing(Dish::getCalories))
												  .map(Dish::getName)
												  .collect(toList());
		System.out.println(comidaEnBajaCalorias);
		
		Map<DishType, List<Dish>> agrupadoPorTipo = menues.stream()
													   .collect(groupingBy(Dish::getType));
		System.out.println(agrupadoPorTipo);
		
		
		List<String> tresComidasAltaEnCalorias = menues.stream()
													.filter(d -> d.getCalories() > 500)
													.map(Dish::getName)
													.limit(3)
													.collect(toList());
		System.out.println(tresComidasAltaEnCalorias);
		
		
		Predicate<Dish> empiezaCONp = a -> a.getName().startsWith("p");
		Predicate<Dish> longitud = a -> a.getName().length() <= 5;
		
		menues.stream()
				.filter(empiezaCONp.and(longitud))
				.forEach(System.out::println);
		
	
		
		String listaToString = menues.stream().map(Dish::getName).collect(joining(", "));
		System.out.println(listaToString);
		
	}

}
