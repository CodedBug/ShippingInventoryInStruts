package com.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class PurchaseInventoryForm extends ActionForm {

	private String purchaseID;

	public String getPurchaseID() {
		return purchaseID;
	}

	public void setPurchaseID(String purchaseID) {
		this.purchaseID = purchaseID;
	}

}