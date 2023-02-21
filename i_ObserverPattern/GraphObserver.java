package i_ObserverPattern;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
        System.out.println("Graph Observer Updated: " + generator.getNumber());
	}
	
}
