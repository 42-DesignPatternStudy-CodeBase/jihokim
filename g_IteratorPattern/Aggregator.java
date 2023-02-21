package g_IteratorPattern;

public abstract class Aggregator {

	public abstract Object getItem(int index);
	public abstract int getLength();
	public abstract Iterator iterator();
	public abstract Iterator reverseIterator();
}
