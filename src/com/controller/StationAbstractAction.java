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
import com.model.StationAbstractForm;
import com.model.StationRowData;

import dao.PurchaseAbstractDAO;
import dao.StationAbstractDAO;

public class StationAbstractAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		PrintWriter out = response.getWriter();

		System.out.println("Inside station abstract action");

		StationAbstractDAO dao = new StationAbstractDAO();
		StationAbstractForm paf = (StationAbstractForm) form;
		List<StationRowData> list = dao.readPurchase(paf);

		request.setAttribute("listStation", list);
		/*StationRowData prdata = null;

		Iterator<StationRowData> itr = list.iterator();*/

		/*out.println("<table sytle='height:200px'><tbody>"
				+ "<tr><td>Station ID</td><td>Station Name</td><td>Username</td><td>Approval Number</td><td>DOI</td><td>DOV</td><td>DOII</td><td>Approval for Servicing</td><td>Approval for OEM</td><td>Active?</td>");

		while (itr.hasNext()) {
			prdata = itr.next();
			out.println("<tr><td>" + prdata.getStationID() + "</td><td>"
					+ prdata.getStationName() + "</td><td>"
					+ prdata.getStationUser() + "</td><td>"
					+ prdata.getApprovalNumber() + "</td><td>"
					+ prdata.getDOI() + "</td><td>" + prdata.getDOV()
					+ "</td><td></td><td></td><td></td>");
		}
		out.println("</tbody></table>");
		out.flush();
		out.close();*/
		return mapping.findForward("success");

	}
}
