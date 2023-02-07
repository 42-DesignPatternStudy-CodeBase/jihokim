package FactoryPattern;

public class Sonata implements Car {
	private final String productName = "Sonata";

	@Override
	public String toString() {
		return productName;
	}
}
