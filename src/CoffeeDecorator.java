
public abstract class CoffeeDecorator implements Coffee {

	protected final Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee c)
	{
		this.decoratedCoffee = c;
	}
	
	@Override
	public float getCost() {
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}

}
