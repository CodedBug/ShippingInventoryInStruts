package com.model;

import java.util.Date;
import java.util.List;

public class Station {
	
	private int id;
	private boolean active;
	
	private String name;
	private Date issueDate;
	private Date validTillDate;
	private Date intermediateInspectionDate;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getIntermediateInspectionDate() {
		return intermediateInspectionDate;
	}
	public void setIntermediateInspectionDate(Date intermediateInspectionDate) {
		this.intermediateInspectionDate = intermediateInspectionDate;
	}
	private String userName;
	
	
	private List<Item> items;
	private List<OEM> oems;
	
	
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getValidTillDate() {
		return validTillDate;
	}
	public void setValidTillDate(Date validTillDate) {
		this.validTillDate = validTillDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<OEM> getOems() {
		return oems;
	}
	public void setOems(List<OEM> oems) {
		this.oems = oems;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
