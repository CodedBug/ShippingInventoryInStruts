package com.model;

import org.apache.struts.action.ActionForm;

public class StationForm extends ActionForm{

	private String stationName;
	private String userName;
	private String approvalNumber;
	private String dateOfIssue;
	private String dateOfValidation;
	private String intermediateInspection;
	private String[] approvalForServicing;	
	private String[] approvalForOEM;
		
	private String active;

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getApprovalNumber() {
		return approvalNumber;
	}

	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfValidation() {
		return dateOfValidation;
	}

	public void setDateOfValidation(String dateOfValidation) {
		this.dateOfValidation = dateOfValidation;
	}

	public String getIntermediateInspection() {
		return intermediateInspection;
	}

	public void setIntermediateInspection(String intermediateInspection) {
		this.intermediateInspection = intermediateInspection;
	}

	public String[] getApprovalForServicing() {
		return approvalForServicing;
	}

	public void setApprovalForServicing(String[] approvalForServicing) {
		this.approvalForServicing = approvalForServicing;
	}

	public String[] getApprovalForOEM() {
		return approvalForOEM;
	}

	public void setApprovalForOEM(String[] approvalForOEM) {
		this.approvalForOEM = approvalForOEM;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	
	
}