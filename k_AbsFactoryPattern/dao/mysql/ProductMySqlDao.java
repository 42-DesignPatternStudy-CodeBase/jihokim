package k_AbsFactoryPattern.dao.mysql;

import k_AbsFactoryPattern.Product;
import k_AbsFactoryPattern.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {

	@Override
	public boolean insertProduct(Product product) {
		String message = "insert into MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		String message = "update from MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete from MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	
}
