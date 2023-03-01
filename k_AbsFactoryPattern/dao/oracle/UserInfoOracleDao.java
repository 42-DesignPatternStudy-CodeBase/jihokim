package k_AbsFactoryPattern.dao.oracle;
import k_AbsFactoryPattern.UserInfo;
import k_AbsFactoryPattern.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public boolean insertUserInfo(UserInfo userinfo) {
		String message = "insert into ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean updateUserInfo(UserInfo userinfo) {
		String message = "update from ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}

	@Override
	public boolean deleteUserInfo(UserInfo userinfo) {
		String message = "delete from ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
