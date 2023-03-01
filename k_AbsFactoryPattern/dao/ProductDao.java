package k_AbsFactoryPattern.dao;

import k_AbsFactoryPattern.Product;

public interface ProductDao {

	boolean insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(Product product);

}
