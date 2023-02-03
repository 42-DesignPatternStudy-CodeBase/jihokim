package FactoryPattern;

public class CarTest {
	public static void main(String[] args) {
		Car car = CarFactory.generate("Sonata");
		System.out.println(car);
		car = CarFactory.generate("Grandeur");
		System.out.println(car);
		car = CarFactory.generate("Genesis");
		System.out.println(car);
	}
}
