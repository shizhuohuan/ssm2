package ssm.service.impl;

import java.sql.SQLException;
import java.util.List;
import ssm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.entity.User;
import ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao  ;
	
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public User get(int cid) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.get(cid);
	}



	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}



	@Override
	public int update(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}



	@Override
	public int insert(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.insert(user);
	}



	@Override
	public int delete(int uid) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.delete(uid);
	}

	

	
	
	
	
}
