package g_IteratorPattern;

public abstract class Iterator {

	protected Aggregator list;
	protected int index = 0;

	public Iterator(Aggregator list) {
		this.list = list;
	}

	public Object first() {
		return list.getItem(0);
	}

	public Object curruntItem() {
		return list.getItem(index);
	}

	public Object next() {
		return list.getItem(index++);
	}

	public boolean hasNext() {
		return list.getLength() > this.index;
	}
}
