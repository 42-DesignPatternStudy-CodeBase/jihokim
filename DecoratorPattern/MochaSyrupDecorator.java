package DecoratorPattern;

public class MochaSyrupDecorator extends Decorator {
	public MochaSyrupDecorator(Component someComponent) {
		super(someComponent);
	}

	@Override
	public String add() {
		return super.add() + " Adding MochaSyrup";
	}
}
