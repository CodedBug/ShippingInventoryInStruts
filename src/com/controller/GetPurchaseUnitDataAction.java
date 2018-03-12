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

import com.model.GetPurchaseUnitDataForm;
import com.model.GetPurchaseUnitRowData;
import com.model.InventoryRowData;
import com.model.Login;
import com.model.PurchaseInventoryForm;
import com.model.PurchaseRowData;

import dao.GetPurchaseUnitDataDAO;
import dao.PurchaseInventoryDAO;

public class GetPurchaseUnitDataAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Inside Get Purchase Unit Data Action");
		HttpSession session=request.getSession();
		
		Login login = (Login) session.getAttribute("login");
		System.out.println("Session Username:"+login.getUser().getUsername());
		String stationName=login.getUser().getUsername();
		
		//GetPurchaseUnitDataForm gpudf = (GetPurchaseUnitDataForm) form;

		GetPurchaseUnitDataDAO dao = new GetPurchaseUnitDataDAO();
		
		/*List<GetPurchaseUnitRowData> list = dao.readInventory(gpudf,stationName);*/
		List<GetPurchaseUnitRowData> list = dao.readInventory(stationName);

		request.setAttribute("listPurchaseUnit", list);
		System.out.println(list);

		//Iterator<InventoryRowData> itr = list.iterator();

		return mapping.findForward("success");

	}
}
