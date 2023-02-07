package DecoratorPattern;

public class KenyaCoffee implements Component {
	private final String name = "KenyaCoffee";

	@Override
	public String add() {
		return name;
	}
}
