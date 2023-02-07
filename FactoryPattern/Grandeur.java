package FactoryPattern;

public class Grandeur implements Car {
	private final String productName = "Grandeur";

	@Override
	public String toString() {
		return productName;
	}
}
