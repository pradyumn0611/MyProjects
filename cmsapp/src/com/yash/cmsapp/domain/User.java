package com.yash.cmsapp.domain;
/**
 * This class has  Details which not common between users and contacts databases.
 * @author pradyumn
 *
 */
public class User {
	/**
	 * status is user is active or inactive.
	 * active status is 1.
	 * inactive status is 2.
	 */
	/**
	 * id of the user which is unique, autogenrated to keep the track of users in database.
	 */
	public int id;
	/**
	 * name of person ragistaring with cmsapp.
	 */
	public String name;
	/**
	 * contact of the user.
	 */
	public String contact;
	/**
	 * address of the user
	 */
	public String address;
	/**
	 * email of the user
	 */
	public String email;
	/**
	 * role of user as admin is guest.
	 */
	private int role;
	/**
	 * active or inavtive user
	 */
	private int status;
	
	/**
	 * login name of user.
	 */
	
	private String loginname;
	/**
	 * password of the user.
	 */
	private String password;
	
	/**
	 * getters and setters of above variables.
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * default constructor
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * parametarized construtor.
	 */
	public User( String name, String contact, String address, String email, int role, int status,
			String loginname, String password) {
		super();
		
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.role = role;
		this.status = status;
		this.loginname = loginname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", email="
				+ email + ", role=" + role + ", status=" + status + ", loginname=" + loginname + ", password="
				+ password + "]";
	}
	
	
	
	
}
