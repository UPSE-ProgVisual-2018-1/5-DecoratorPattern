
public class CoffeeWithSprinkles extends CoffeeDecorator {

	public CoffeeWithSprinkles(Coffee c) {
		super(c);
	}

	@Override
	public float getCost() {
		return super.getCost() + (float) 0.2;
	}

	@Override
	public String getIngredients()
	{
		return super.getIngredients() + " Sprinkles, ";
	}
	
}
