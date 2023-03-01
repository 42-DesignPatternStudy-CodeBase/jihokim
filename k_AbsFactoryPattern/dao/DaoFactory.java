package k_AbsFactoryPattern.dao;

public abstract class DaoFactory {

	public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao(); 

}
