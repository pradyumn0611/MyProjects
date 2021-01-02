package com.yash.cmsapp.service;

import java.util.List;

import com.yash.cmsapp.domain.Contact;
/**
 * This interface Gives information about What functionality we will be working in this module.
 * @author pradyumn
 *
 */

public interface ContactService {
	/**
	 * Creates Contacts of user in cmsapp.
	 * @param contact
	 */
	public void createContact(Contact contact);
	/**
	 * Displays Contacts of user in cmsapp.
	 * @param contact
	 */

	public void editContact(Contact contact);
	/**
	 * Edits Contacts of user in cmsapp.
	 * @param contact
	 */
	public List<Contact> listContact();
	/**
	 * Deletes  Contacts of user in cmsapp.
	 * @param contact
	 */
	public void deleteContact();
	/**
	 * Searches for Contacts of user in cmsapp.
	 * @param contact
	 */
	public List<Contact> searchContact();
}
	