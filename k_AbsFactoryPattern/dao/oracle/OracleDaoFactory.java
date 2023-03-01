package k_AbsFactoryPattern.dao.oracle;

import k_AbsFactoryPattern.dao.DaoFactory;
import k_AbsFactoryPattern.dao.ProductDao;
import k_AbsFactoryPattern.dao.UserInfoDao;

public class OracleDaoFactory extends DaoFactory {

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoOracleDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductOracleDao();
	}
	
}
