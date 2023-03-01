package k_AbsFactoryPattern.dao.mssql;
import k_AbsFactoryPattern.UserInfo;
import k_AbsFactoryPattern.dao.UserInfoDao;

public class UserInfoMsSqlDao implements UserInfoDao {

	@Override
	public boolean insertUserInfo(UserInfo userinfo) {
		String message = "insert into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean updateUserInfo(UserInfo userinfo) {
		String message = "update from MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean deleteUserInfo(UserInfo userinfo) {
		String message = "delete from MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}

}
