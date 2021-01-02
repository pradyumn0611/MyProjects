package com.yash.cmsapp.daoimpl;

import java.sql.PreparedStatement;

import java.util.List;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.util.DBUtil;
/**
 *  This class does implementation of methods defined for csmapp and provides data to database.
 * @author pradyumn
 *
 */

public class UserDAOImpl extends DBUtil implements UserDAO{
/**
 * Saves datails for user Ragistration for CMS App.
 */
	@Override
	public void save(User user) {
		String sql="INSERT INTO users(NAME,contact,address,email,STATUS,role,loginname,PASSWORD) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=getPrepareStatement(sql);
		try
		{
			pstmt.setString(1,user.getName());
			
			pstmt.setString(2,user.getContact());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, ACTIVE_STATUS);
			pstmt.setInt(6, ROLE_ADMIN);
			pstmt.setString(7,user.getLoginname());
			pstmt.setString(8,user.getPassword());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<User> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
