
public class CoffeeRunner {

	public static void printCoffee(Coffee c)
	{
		System.out.println("Cost: " + c.getCost() + " ... Ingredients: " + c.getIngredients());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c = new SimpleCoffee();
		printCoffee(c);
		
		c = new CoffeeWithMilk(c);
		printCoffee(c);
		
		c = new CoffeeWithSprinkles(c);
		printCoffee(c);
	}

}
