package g_IteratorPattern;

public abstract class IteratorFactory {

	public final Iterator create(Aggregator list, int type) {
		Iterator p = createProduct(list, type);
		return p;
	}

	protected abstract Iterator createProduct(Aggregator list, int type);
}
