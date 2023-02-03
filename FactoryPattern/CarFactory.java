package FactoryPattern;

public class CarFactory {
	static public Car generate(String carName) {
		if (carName.equalsIgnoreCase("Sonata")) {
			return new Sonata();
		} else if (carName.equalsIgnoreCase("Grandeur")) {
			return new Grandeur();
		} else if (carName.equalsIgnoreCase("Genesis")) {
			return new Genesis();
		} else {
			return null;
		}
		// switch (carName) {
		// 	case "Sonata":
		// 		return new Sonata();
		// 	case "Grandeur":
		// 		return new Grandeur();
		// 	case "Genesis":
		// 		return new Genesis();
		// 	default:
		// 		return null;
		// }
	}
}
