package l_CompositePattern;

import java.util.ArrayList;

public class Category extends ProductCategory {

	private ArrayList<ProductCategory> category = new ArrayList<>();

	public Category(int id, String name, int price) {
		super(id, name, 0);
	}

	@Override
	public void addProduct(ProductCategory product) {
		this.category.add(product);
	}

	@Override
	public void removeProduct(ProductCategory product) {
		this.category.remove(product);
	}

	@Override
	public int getCount() {
		int count = 0;
		for ( ProductCategory elem: this.category ) {
			count += elem.getCount();
		}
		return count;
	}

	@Override
	public String getName() { return this.name; }

	@Override
	public int getPrice() {
		int price = 0;
		for ( ProductCategory elem: this.category ) {
			price += elem.getPrice();
		}
		return price;
	}

	@Override
	public int getId() { return this.id; }

}
