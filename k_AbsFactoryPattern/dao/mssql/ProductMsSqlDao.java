package k_AbsFactoryPattern.dao.mssql;

import k_AbsFactoryPattern.Product;
import k_AbsFactoryPattern.dao.ProductDao;

public class ProductMsSqlDao implements ProductDao {

	@Override
	public boolean insertProduct(Product product) {
		String message = "insert into MSSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		String message = "update from MSSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete from MSSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	
}
