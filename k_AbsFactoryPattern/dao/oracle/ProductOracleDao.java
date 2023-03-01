package k_AbsFactoryPattern.dao.oracle;

import k_AbsFactoryPattern.Product;
import k_AbsFactoryPattern.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

	@Override
	public boolean insertProduct(Product product) {
		String message = "insert into Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		String message = "update from Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete from Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	
}
