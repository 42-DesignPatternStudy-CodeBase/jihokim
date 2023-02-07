package FactoryPattern;

public class GenesisFactory implements CarFactory {
	@Override
	public Car generate() {
		return new Genesis();
	}	
}
