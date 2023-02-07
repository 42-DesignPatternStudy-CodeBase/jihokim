package DecoratorPattern;

public abstract class Decorator implements Component {
	private Component mixedComponent;

	public Decorator(Component someComponent) {
		this.mixedComponent = someComponent;
	}

	public String add() {
		return mixedComponent.add();
	}
}
