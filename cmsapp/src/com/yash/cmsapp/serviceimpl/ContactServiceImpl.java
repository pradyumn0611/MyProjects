package com.yash.cmsapp.serviceimpl;



import java.util.List;

import com.yash.cmsapp.dao.ContactDAO;
import com.yash.cmsapp.daoimpl.ContactDAOImpl;
import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.service.ContactService;
/**
 * Provides implementation to all the functionality provided in ContactService interface.  
 * @author pradyumn
 *
 */
public class ContactServiceImpl implements ContactService{
	
	 public ContactDAO contactDAO;
	/**
	 * Provides Service of Contact Creation.
	 */
	@Override
	public void createContact(Contact contact) {
		contactDAO=new ContactDAOImpl();
		contactDAO.save(contact);
		
	}

	/**
	 * Provides Service of Contact Editing.
	 */
	@Override
	public void editContact(Contact contact) {
		contactDAO=new ContactDAOImpl();
		contactDAO.update(contact);		
	}

	/**
	 * Provides Service of Displaying contacts.
	 */
	@Override
	public List<Contact> listContact() {
		contactDAO=new ContactDAOImpl();
		return contactDAO.findall();
	}

	/**
	 * Provides Service of Contact Creation.
	 */
	@Override
	public void deleteContact() {
		contactDAO=new ContactDAOImpl();
		contactDAO.delete();
		
	}

	/**
	 * Provides Service of Contact Search.
	 */
	@Override
	public List<Contact> searchContact() {
		contactDAO=new ContactDAOImpl();
		return contactDAO.search();
		
	}

	

}
