package f_StrategyPatternDB.userinfo.dao.mssql;
import f_StrategyPatternDB.userinfo.UserInfo;
import f_StrategyPatternDB.userinfo.dao.UserInfoDao;

public class UserInfoMssqlDao implements UserInfoDao {
    @Override
	public boolean insert(UserInfo userinfo) {
		String message = "insert into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean update(UserInfo userinfo) {
		String message = "update into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean delete(UserInfo userinfo) {
		String message = "delete into MSSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
