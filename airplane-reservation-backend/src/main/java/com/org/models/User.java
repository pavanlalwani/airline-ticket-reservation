package com.org.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	private String userType;
	@Id
	private BigInteger userID;
	private String username;
	private String userPassword;
	private BigInteger contact_no;
	private String email;
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public BigInteger getUserID() {
		return userID;
	}
	public void setUserID(BigInteger userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getContact_no() {
		return contact_no;
	}
	public void setContact_no(BigInteger contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(String userType, BigInteger userID, String username, String userPassword, BigInteger contact_no,
			String email) {
		super();
		this.userType = userType;
		this.userID = userID;
		this.username = username;
		this.userPassword = userPassword;
		this.contact_no = contact_no;
		this.email = email;
	}
	public User() {
		
	}
	
}
