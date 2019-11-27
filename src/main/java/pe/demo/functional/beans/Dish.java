package pe.demo.functional.beans;

public class Dish {
	String name;
	int calories;
	 DishType type;
	

	public Dish(String name,  int calories, DishType type) {
		this.name = name;
		this.calories = calories;
		this.type = type;
	}

	public int getCalories() {

		return calories;
	}

	public String getName() {
		
		return name;
	}

	public DishType getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
