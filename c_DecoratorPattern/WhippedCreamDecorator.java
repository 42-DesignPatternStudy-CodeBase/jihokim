package c_DecoratorPattern;

public class WhippedCreamDecorator extends Decorator {
	public WhippedCreamDecorator(Component someComponent) {
		super(someComponent);
	}

	@Override
	public String add() {
		return super.add() + " Adding WhippedCream";
	}
}
