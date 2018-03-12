package com.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class PurchaseAbstractForm extends ActionForm{
		
		private List<PurchaseRowData> results=new ArrayList<PurchaseRowData>();
				
		public List<PurchaseRowData> getResults() {
			return results;
		}
		public void setResults(List<PurchaseRowData> results) {
			this.results = results;
		}
		
}