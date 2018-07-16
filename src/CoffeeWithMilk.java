
public class CoffeeWithMilk extends CoffeeDecorator {

	public CoffeeWithMilk(Coffee c) {
		super(c);
	}
	
	@Override
	public float getCost() {
		return super.getCost() + (float) 0.5;
	}

	@Override
	public String getIngredients()
	{
		return super.getIngredients() + " Milk, ";
	}
}
