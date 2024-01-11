package com.cloth.sehrat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity( name = "userDetails")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String name;
	private String userEmail;
	private String userPassword;
	private long  userPhoneNumber;
	private String dob;
	private String imgSrc;
	
	public UserEntity() {
	}

	public UserEntity(String name, String userEmail, String userPassword, long userPhoneNumber, String  dob, String imgSrc) {
		super();
		this.name = name;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhoneNumber = userPhoneNumber;
		this.dob = dob;
		this.imgSrc = imgSrc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userPhoneNumber=" + userPhoneNumber + ", dob=" + dob + ", imgSrc=" + imgSrc + "]";
	}
}
