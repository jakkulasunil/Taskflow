package com.taskflow.model;

import java.util.Date;

public class User {
	
	private String emailId;
	private String password;
	private Date updatedDate;
	private String website;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	 
	public User(String emailId, String password, Date updatedDate, String website) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.updatedDate = updatedDate;
		this.website = website;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", password=" + password + ", updatedDate=" + updatedDate + ", website="
				+ website + "]";
	}
	
}
