package com.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.model.InventoryRowData;
import com.model.PurchaseInventoryForm;
import com.model.PurchaseRowData;

import dao.PurchaseInventoryDAO;

public class ViewPurchaseInventoryAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Inside purchase Inventory action");
		
		HttpSession session = request.getSession();

		PurchaseInventoryForm pif = (PurchaseInventoryForm) form;

		PurchaseInventoryDAO dao = new PurchaseInventoryDAO();
		
		List<InventoryRowData> list = dao.readInventory(pif);

		request.setAttribute("listInventory", list);
		System.out.println(list);

		//Iterator<InventoryRowData> itr = list.iterator();

		return mapping.findForward("success");

	}
}
