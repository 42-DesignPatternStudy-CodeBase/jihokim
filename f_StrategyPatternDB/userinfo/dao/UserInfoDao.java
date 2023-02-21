package f_StrategyPatternDB.userinfo.dao;
import f_StrategyPatternDB.userinfo.UserInfo;

public interface UserInfoDao {
	boolean insert(UserInfo userinfo);
	boolean update(UserInfo userinfo);
	boolean delete(UserInfo userinfo);
}
