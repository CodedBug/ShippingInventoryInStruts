package com.model;

import java.io.File;
import java.util.Date;

public class PurchaseUnit {
private int id;
private Item item;
private int quantity;
private Date purchaseDate;
private Date expiryDate;

private ImportType importType;
private File invoice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(Date purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}

public ImportType getImportType() {
	return importType;
}
public void setImportType(ImportType importType) {
	this.importType = importType;
}
public File getInvoice() {
	return invoice;
}
public void setInvoice(File invoice) {
	this.invoice = invoice;
}

}
