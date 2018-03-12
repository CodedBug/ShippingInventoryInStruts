package com.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class StationAbstractForm extends ActionForm {
	private List<StationRowData> results = new ArrayList<StationRowData>();

	public List<StationRowData> getResults() {
		return results;
	}

	public void setResults(List<StationRowData> results) {
		this.results = results;
	}

}