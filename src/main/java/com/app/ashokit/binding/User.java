package com.app.ashokit.binding;

import lombok.Data;

@Data
public class User {
	private Integer userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private Long userPhno;
	private String userGender;
	private Integer userCountry;
	private Integer userState;
	private Integer userCity;
	private String userPwd;
	private String userAccStatus;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(Long userPhno) {
		this.userPhno = userPhno;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Integer getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(Integer userCountry) {
		this.userCountry = userCountry;
	}

	public Integer getUserState() {
		return userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	public Integer getUserCity() {
		return userCity;
	}

	public void setUserCity(Integer userCity) {
		this.userCity = userCity;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserAccStatus() {
		return userAccStatus;
	}

	public void setUserAccStatus(String userAccStatus) {
		this.userAccStatus = userAccStatus;
	}

}
