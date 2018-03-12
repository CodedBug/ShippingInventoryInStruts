package com.controller;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.model.PurchaseAbstractForm;
import com.model.PurchaseRowData;

import dao.PurchaseAbstractDAO;

public class PurchaseAbstractAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		System.out.println("Inside purchase abstract action");

		PurchaseAbstractDAO dao = new PurchaseAbstractDAO();
		PurchaseAbstractForm paf = (PurchaseAbstractForm) form;
		List<PurchaseRowData> list = dao.readPurchase(paf);

		request.setAttribute("listPurchase", list);
				
		return mapping.findForward("success");
		//return mapping.getInputForward();

	}
}
