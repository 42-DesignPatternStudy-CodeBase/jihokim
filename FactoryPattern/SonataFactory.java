package FactoryPattern;

public class SonataFactory implements CarFactory {
	@Override
	public Car generate() {
		return new Sonata();
	}	
}
