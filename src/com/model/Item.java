package com.model;

public class Item {
private int itemId;
private String itemName;
private String category;
private Manufacturer manufacturer;
private String batchNumber;

public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Manufacturer getManufacturer() {
	return manufacturer;
}
public void setManufacturer(Manufacturer manufacturer) {
	this.manufacturer = manufacturer;
}
public String getBatchNumber() {
	return batchNumber;
}
public void setBatchNumber(String batchNumber) {
	this.batchNumber = batchNumber;
}

}
