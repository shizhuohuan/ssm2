package ssm.service;



import ssm.entity.User;

import java.sql.SQLException;
import java.util.List;



public interface UserService {

	public User get(int cid) throws SQLException;
	
	public List<User> getAll() throws SQLException ;
	
	public int update(User user) throws SQLException ;
	
	public int insert(User user) throws SQLException ;
	
	public int delete(int uid) throws SQLException ;
}
