package i_ObserverPattern;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

	private Random random = new Random();
    private int number;

	@Override
	public void execute() {
		number = random.nextInt(20);
		notifyObservers();
	}

	@Override
	public int getNumber() { return number; }

}
