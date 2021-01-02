package com.yash.cmsapp.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.daoimpl.UserDAOImpl;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.util.DBUtil;
/**
 * This class Provides functanality to services provided by csm app. Does servises asked by user.
 * @author pradyumn
 *
 */
public class UserServiceImpl extends DBUtil implements UserService {
	public UserDAO userDAO=null;
	public UserServiceImpl()
	{
		userDAO=new UserDAOImpl();//tight coupling
	}
	/**
	 * Provides Service of user ragistration.
	 */
	@Override
	public void ragisterUser(User user) {
		userDAO.save(user);
		
	}
	/**
	 * Provides Service of autentication.
	 */
	@Override
	public User userAuthentication(String loginName, String password) {
		String sql="SELECT * FROM users WHERE loginname=? AND PASSWORD=?";
		PreparedStatement pstmt=getPrepareStatement(sql);
		User user=null;
		try
		{
			pstmt.setString(1, loginName);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			
		if(rs.next())
		{
		
		user=new User(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getString(9));
			
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public List<User> listOfUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void blockAllActiveUsers(User user) {
		// TODO Auto-generated method stub
		
	}

}
