package com.yash.cmsapp.service;

import java.util.List;

import com.yash.cmsapp.domain.User;
/**
 * UserService States Which services are provided by the csmapp.
 * @author pradyumn
 *
 */
public interface UserService {
	/**
	 * Registers user with cmsapp;
	 * @param user
	 */
	public void ragisterUser(User user);
	/**
	 * For authenticating user and processing login.
	 * @param loginName
	 * @param password
	 * @return
	 */
	public User userAuthentication(String loginName,String password);
	/**
	 * this method will give list of users.
	 */
	public List<User> listOfUsers();
	/**
	 * This method blocks all users.
	 */
	public void blockAllActiveUsers(User user);

}
