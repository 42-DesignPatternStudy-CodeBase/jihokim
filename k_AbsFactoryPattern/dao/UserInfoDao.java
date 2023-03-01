package k_AbsFactoryPattern.dao;
import k_AbsFactoryPattern.UserInfo;

public interface UserInfoDao {

	boolean insertUserInfo(UserInfo userinfo);
	boolean updateUserInfo(UserInfo userinfo);
	boolean deleteUserInfo(UserInfo userinfo);

}
