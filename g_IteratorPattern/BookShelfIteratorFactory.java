package g_IteratorPattern;

public class BookShelfIteratorFactory extends IteratorFactory {

	private static final int NORMAL = 0;
	private static final int REVERSE = 1;

	@Override
	protected Iterator createProduct(Aggregator list, int type) {
		switch (type) {
			case NORMAL:
				return new BookShelfIterator(list);
				// return list.iterator();
			case REVERSE:
				return new BookShelfReverseIterator(list);
			default:
				return null;
		}
	}
	
}
