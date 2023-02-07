package FactoryPattern;

public class GrandeurFactory implements CarFactory {
	@Override
	public Car generate() {
		return new Grandeur();
	}	
}
