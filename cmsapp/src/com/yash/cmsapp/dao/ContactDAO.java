package com.yash.cmsapp.dao;

import java.util.List;

import com.yash.cmsapp.domain.Contact;

/**
 * Methods of contact are declared in this inverface.
 * @author pradyumn
 *
 */
public interface ContactDAO {
	public void save(Contact contact);
	
	public List<Contact> findall();
	
	public void update(Contact contact);
	
	public void delete();
	
	public List<Contact> search();
	


}
