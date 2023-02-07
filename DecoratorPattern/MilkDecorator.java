package DecoratorPattern;

public class MilkDecorator extends Decorator {
	public MilkDecorator(Component someComponent) {
		super(someComponent);
	}

	@Override
	public String add() {
		return super.add() + " Adding Milk";
	}
}
