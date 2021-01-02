package com.yash.cmsapp.dao;

import java.util.List;

import com.yash.cmsapp.domain.User;
/**
 * This Provides declaration of things and that we will be doing during implementation of cmsapp.
 * @author pradyumn
 *
 */
public interface UserDAO {
	void save(User user);

	List<User>findall();
	
	void update(User user);
	
	void delete(User user);
	
	void delete(int id);
	
	int ACTIVE_STATUS=1;
	
	int INACTIVE_STATUS=2;
	
	int ROLE_ADMIN=1;
	
	int ROLE_GUEST=2;

}
