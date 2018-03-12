package com.model;

import java.util.Date;



public class Login {
private Date lastLoginTimeStamp;
private User user;
public Date getLastLoginTimeStamp() {
	return lastLoginTimeStamp;
}
public void setLastLoginTimeStamp(Date lastLoginTimeStamp) {
	this.lastLoginTimeStamp = lastLoginTimeStamp;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
