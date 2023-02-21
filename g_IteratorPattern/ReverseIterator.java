package g_IteratorPattern;

public abstract class ReverseIterator {

	private Aggregator list;
	private int index = 0;

	public ReverseIterator(Aggregator list) {
		this.list = list;
		this.index = list.getLength();
	}

	public Object first() {
		return list.getItem(list.getLength() - 1);
	}

	public Object curruntItem() {
		return list.getItem(index - 1);
	}

	public Object next() {
		return list.getItem(--index);
	}

	public boolean hasNext() {
		return this.index != 0;
	}
}
