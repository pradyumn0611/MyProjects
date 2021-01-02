package com.yash.cmsapp.domain;
/**
 * Provides declaration to variables of contacts of the user. 
 * @author pradyumn
 *
 */
public class Contact  {
	
	private String name;
	/**
	 * contact number of contact.
	 */
	private String contact;
	/**
	 * address of contact added.
	 */
	private String address;
	/*
	 * email of contact
	 */
	private String email;
	/**
	 * Login name of user which is logged in.
	 */
	public static String loggedInUserLoginName;
	/**
	 * Name of user logged in to cms.
	 */
	public static String loggedInUserContactName;
	
	/**
	 * default constructor of contact used as purpose of creating object of contact.
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * parametarized constructor for contact.
	 * @param name
	 * @param contact
	 * @param address
	 * @param email
	 */
	public Contact( String name, String contact, String address, String email) {
		super();
		
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
	}
	
	/**
	 * getters and seters.
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static String getLoggedInUserLoginName() {
		return loggedInUserLoginName;
	}
	public static void setLoggedInUserLoginName(String loggedInUserLoginName) {
		Contact.loggedInUserLoginName = loggedInUserLoginName;
	}
	public static String getLoggedInUserContactName() {
		return loggedInUserContactName;
	}
	public static void setLoggedInUserContactName(String loggedInUserContactName) {
		Contact.loggedInUserContactName = loggedInUserContactName;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", contact=" + contact + ", address="
				+ address + ", email=" + email ;
	}
	
	
}
