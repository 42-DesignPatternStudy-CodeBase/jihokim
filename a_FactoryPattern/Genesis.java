package a_FactoryPattern;

public class Genesis implements Car {
	private final String productName = "Genesis";

	@Override
	public String toString() {
		return productName;
	}
}
