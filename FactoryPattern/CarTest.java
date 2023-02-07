package FactoryPattern;

public class CarTest {
	public static void main(String[] args) {
		Car car;
		car = new SonataFactory().generate();
		System.out.println(car);
		car = new GrandeurFactory().generate();
		System.out.println(car);
		car = new GenesisFactory().generate();
		System.out.println(car);
	}
}
