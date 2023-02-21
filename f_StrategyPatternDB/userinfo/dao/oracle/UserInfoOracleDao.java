package f_StrategyPatternDB.userinfo.dao.oracle;
import f_StrategyPatternDB.userinfo.UserInfo;
import f_StrategyPatternDB.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
	public boolean insert(UserInfo userinfo) {
		String message = "insert into ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean update(UserInfo userinfo) {
		String message = "update into ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean delete(UserInfo userinfo) {
		String message = "delete into ORACLE DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
