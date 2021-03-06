package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.model.Login;
import com.model.LoginForm;
import com.model.UserType;

import dao.LoginDAO;

public class LogoutAction extends Action{

	private String forwardActionValue;
		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
 
    	session.invalidate();
        
        //return mapping.findForward(forwardActionValue);
    	return mapping.findForward("success");
 
    }

}