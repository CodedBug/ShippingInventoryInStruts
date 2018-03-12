package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.model.StationForm;

import dao.StationDAO;

public class StationAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();

		StationForm stationform = (StationForm) form;

		StationDAO dao = new StationDAO();
		boolean done = dao.insertStation(stationform);

		if (!done) {
			System.out.println("insert false ");
			return mapping.findForward("error");
		}

		return mapping.findForward("success");
		// return mapping.getInputForward(); //to return to input page

	}

}