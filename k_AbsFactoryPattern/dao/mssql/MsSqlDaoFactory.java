package k_AbsFactoryPattern.dao.mssql;

import k_AbsFactoryPattern.dao.DaoFactory;
import k_AbsFactoryPattern.dao.ProductDao;
import k_AbsFactoryPattern.dao.UserInfoDao;

public class MsSqlDaoFactory extends DaoFactory {

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoMsSqlDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductMsSqlDao();
	}
	
}
