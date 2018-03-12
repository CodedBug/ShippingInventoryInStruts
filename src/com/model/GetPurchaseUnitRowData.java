package com.model;

import java.io.Serializable;

public class GetPurchaseUnitRowData implements Serializable {
	private String batchNo;
	private String manufacturer;
	private String itemName;
	private String categoryName;
	private String quantityLeft;
	private String expiryDate;
	private String stationName;
	private String approved;
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public void setQuantityLeft(String quantityLeft) {
		this.quantityLeft = quantityLeft;
	}
	public String getQuantityLeft() {
		return quantityLeft;
	}

}
