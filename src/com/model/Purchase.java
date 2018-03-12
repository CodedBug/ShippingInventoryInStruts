package com.model;

import java.util.List;

public class Purchase {

	private int id;
	private List<PurchaseUnit> purchaseUnits;
	private boolean approved;
	
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<PurchaseUnit> getPurchaseUnits() {
		return purchaseUnits;
	}
	public void setPurchaseUnits(List<PurchaseUnit> purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}


public boolean isApproved() {
	return approved;
}
public void setApproved(boolean approved) {
	this.approved = approved;
}

}
