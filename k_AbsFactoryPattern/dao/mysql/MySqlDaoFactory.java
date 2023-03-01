package k_AbsFactoryPattern.dao.mysql;

import k_AbsFactoryPattern.dao.DaoFactory;
import k_AbsFactoryPattern.dao.ProductDao;
import k_AbsFactoryPattern.dao.UserInfoDao;

public class MySqlDaoFactory extends DaoFactory {

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoMySqlDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductMySqlDao();
	}
	
}
