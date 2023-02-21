package i_ObserverPattern;

public class Example {

	public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

		generator.addObserver(observer1);
        generator.addObserver(observer2);

		generator.execute();
		generator.execute();

		System.out.println("=======================");

        generator.deleteObserver(observer2);

		generator.execute(); 
    }

}
