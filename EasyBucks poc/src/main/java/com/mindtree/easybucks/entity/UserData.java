package com.mindtree.easybucks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserData {
@Id
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
@Column
private String name;
@Column
private String phone;
@Column
private String email;
@Column
private String password;
@Column
private String confirmpassword;
@Column
private String role;
public UserData(int userid, String name, String phone, String email,String password,String confirmpassword,String role) {
	super();
	this.userid = userid;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.role = role;
}
public UserData() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + userid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserData other = (UserData) obj;
	if (userid != other.userid)
		return false;
	return true;
}

}
