package com.yash.cmsapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.yash.cmsapp.dao.ContactDAO;
import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.util.DBUtil;


/**
 * This class does the implementation of functionality given in ContactDAO.
 * @author pradyumn
 *
 */

public class ContactDAOImpl extends DBUtil implements ContactDAO {

	/**
	 * Implements contact save operation.
	 */

	@Override
	public void save(Contact contact) {
		String sql="INSERT INTO contacts(userid,NAME,contact,address,email) VALUES((select id from users where loginname=?),?,?,?,?)";
		PreparedStatement pstmt=getPrepareStatement(sql);
		try
		{


			pstmt.setString(1, Contact.loggedInUserLoginName);
			pstmt.setString(2,contact.getName());
			pstmt.setString(3,contact.getContact());
			pstmt.setString(4, contact.getAddress());
			pstmt.setString(5, contact.getEmail());

			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
/**
 * Implements contact display operation.
 */
	@Override
	public List<Contact> findall() {
		List<Contact> list=new ArrayList<>();
		try {

			String sql="select name,contact,address,email from contacts where userid=(select id from users where loginname=?)";

			PreparedStatement pstmt=getPrepareStatement(sql);
			pstmt.setString(1, Contact.loggedInUserLoginName);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				list.add(new Contact(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			return list;
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
/**
 * Implements contact update operation.
 */
	@Override
	public void update(Contact contact) {
		String sql="UPDATE  contacts SET NAME=?,contact=?,address=?,email=? WHERE NAME=? and userid=(select id from users where loginname=?);";
		PreparedStatement pstmt=getPrepareStatement(sql);
		try
		{


			pstmt.setString(1,contact.getName());
			pstmt.setString(2,contact.getContact());
			pstmt.setString(3, contact.getAddress());
			pstmt.setString(4, contact.getEmail());
			pstmt.setString(5, Contact.loggedInUserContactName);
			pstmt.setString(6, Contact.loggedInUserLoginName);


			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
/**
 * Implements contact delete operation.
 */
	@Override
	public void delete() {
		String sql="delete from contacts where userid=(select id from users where loginname=?) and name=?";
		try
		{
			PreparedStatement pstmt=getPrepareStatement(sql);
			pstmt.setString(1, Contact.getLoggedInUserLoginName());
			pstmt.setString(2, Contact.getLoggedInUserContactName());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
/**
 * Implements contact search for all the contacts over cmsapp.
 */
	@Override
	public List<Contact> search() {
		List<Contact> list=new ArrayList<>();
	try {
		Contact contact=new Contact();
		String sql="select name,contact,address,email from contacts where name=?";

		PreparedStatement pstmt=getPrepareStatement(sql);
		pstmt.setString(1,Contact.loggedInUserContactName);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			list.add(new Contact(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		return list;
	}

	catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;


	}


}

