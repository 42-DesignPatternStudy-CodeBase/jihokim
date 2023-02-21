package g_IteratorPattern;

public class BookShelfReverseIterator extends Iterator {

	public BookShelfReverseIterator(Aggregator list) {
		super(list);
	}

	@Override
	public Object first() {
		return super.list.getItem(list.getLength() - 1);
	}

	@Override
	public Object curruntItem() {
		return super.list.getItem(list.getLength() - this.index - 1);
	}

	@Override
	public Object next() {
		return super.list.getItem(list.getLength() - ++this.index);
	}
}
