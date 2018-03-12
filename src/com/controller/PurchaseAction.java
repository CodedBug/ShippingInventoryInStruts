package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;

import com.model.PurchaseForm;

import dao.PurchaseDAO;

public class PurchaseAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();

		PurchaseForm purchaseform = (PurchaseForm) form;

		PurchaseDAO dao = new PurchaseDAO();
		boolean done = dao.insertPurchase(purchaseform);

		if (!done) {
			System.out.println("select failed");
			return mapping.findForward("error");
		}
		return mapping.findForward("success");
		// return mapping.getInputForward(); //to return to input page

	}

}