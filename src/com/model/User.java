package com.model;

import java.util.List;

public class User {
private String username;
private String password;
private UserType userType;


private List<Role> roles;



public List<Role> getRoles() {
	return roles;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
public UserType getUserType() {
	return userType;
}
public void setUserType(UserType userType) {
	this.userType = userType;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
