package c_DecoratorPattern;

public class EtiopiaCoffee implements Component {
	private final String name = "EtiopiaCoffee";

	@Override
	public String add() {
		return name;
	}
}
