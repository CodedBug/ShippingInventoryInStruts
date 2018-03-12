package com.model;

import java.io.Serializable;

public class PurchaseRowData implements Serializable{
private	 String purchaseID;
private	 String stationUser;
private String creationtime;
private String approvalStatus;
public String getPurchaseID() {
	return purchaseID;
}
public void setPurchaseID(String purchaseID) {
	this.purchaseID = purchaseID;
}
public String getStationUser() {
	return stationUser;
}
public void setStationUser(String stationUser) {
	this.stationUser = stationUser;
}
public String getCreationtime() {
	return creationtime;
}
public void setCreationtime(String creationtime) {
	this.creationtime = creationtime;
}
public String getApprovalStatus() {
	return approvalStatus;
}
public void setApprovalStatus(String approvalStatus) {
	this.approvalStatus = approvalStatus;
}


}
