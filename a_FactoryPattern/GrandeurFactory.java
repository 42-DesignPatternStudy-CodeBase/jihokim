package a_FactoryPattern;

public class GrandeurFactory implements CarFactory {
	@Override
	public Car generate() {
		return new Grandeur();
	}	
}
