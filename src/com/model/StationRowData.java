package com.model;

import java.io.Serializable;

public class StationRowData implements Serializable{
	private String stationID;
	private String stationName;
	private String stationUser;
	private String activeStatus;
	private String approvalNumber;
	private String DOI;
	private String DOV;
	private String DOII;

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationUser() {
		return stationUser;
	}

	public void setStationUser(String stationUser) {
		this.stationUser = stationUser;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getApprovalNumber() {
		return approvalNumber;
	}

	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	public String getDOI() {
		return DOI;
	}

	public void setDOI(String dOI) {
		DOI = dOI;
	}

	public String getDOV() {
		return DOV;
	}

	public void setDOV(String dOV) {
		DOV = dOV;
	}

	public String getDOII() {
		return DOII;
	}

	public void setDOII(String dOII) {
		DOII = dOII;
	}

}
