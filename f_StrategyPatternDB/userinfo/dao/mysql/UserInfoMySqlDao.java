package f_StrategyPatternDB.userinfo.dao.mysql;
import f_StrategyPatternDB.userinfo.UserInfo;
import f_StrategyPatternDB.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
	public boolean insert(UserInfo userinfo) {
		String message = "insert into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean update(UserInfo userinfo) {
		String message = "update into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean delete(UserInfo userinfo) {
		String message = "delete into MYSQL DB userId = " + userinfo.getUserId();
		System.out.println(message);
		return true;
	}
}
