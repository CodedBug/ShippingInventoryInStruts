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
import com.model.ServiceForm;

import dao.PurchaseDAO;
import dao.ServiceDAO;

public class ServiceAction extends Action{

		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
 
    	ServiceForm serviceform = (ServiceForm) form;
    	
	                    
    	ServiceDAO dao = new ServiceDAO();
        boolean done=dao.insertService(serviceform);
       
        
        if(!done)
        {
        	System.out.println("insert false ");
        	return mapping.findForward("error");
        }
        
        
         return mapping.getInputForward(); //to return to input page
 
    }

}