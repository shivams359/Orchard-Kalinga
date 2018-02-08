package com.mindtree.easybucks.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="user_id")
	private int userId;
	
	@Column (name="user_name", nullable=false)
	private String userName;
	
	@ManyToOne
	@JoinColumn (name="role_id", nullable=false)
	private UserRole userRole;
	
	@Column (name="user_dob")
	private Date userDob;
	
	@Column (name="user_email", nullable=false)
	private String userEmail;
	
	@Column (name="user_occupation")
	private String userOccupation;
	
	@Column (name="user_city")
	private String userCity;
	
	@Column (name="user_income")
	private double userIncome;
	
	@Column (name="user_phone")
	private long userPhone;
	
	@Column (name="user_password",nullable=false)
	private String userPassword;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserOccupation() {
		return userOccupation;
	}
	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public double getUserIncome() {
		return userIncome;
	}
	public void setUserIncome(double userIncome) {
		this.userIncome = userIncome;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
