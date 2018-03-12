package com.model;

public class Inventory {
private int inventoryId;
private Item item;
private int quantityInHand;
public int getInventoryId() {
	return inventoryId;
}
public void setInventoryId(int inventoryId) {
	this.inventoryId = inventoryId;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public int getQuantityInHand() {
	return quantityInHand;
}
public void setQuantityInHand(int quantityInHand) {
	this.quantityInHand = quantityInHand;
}


}
