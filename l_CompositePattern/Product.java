package l_CompositePattern;

public class Product extends ProductCategory {

	private int count = 1;

	public Product(int id, String name, int price) {
		super(id, name, price);
	}

	@Override
	public void addProduct(ProductCategory product) {}

	@Override
	public void removeProduct(ProductCategory product) {}

	@Override
	public int getCount() { return this.count; }

	@Override
	public String getName() { return this.name; }

	@Override
	public int getPrice() { return this.price; }

	@Override
	public int getId() { return this.id; }

}
