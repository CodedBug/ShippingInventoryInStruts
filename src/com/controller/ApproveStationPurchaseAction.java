package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;

import com.model.ApproveStationPurchaseForm;
import com.model.PurchaseForm;

import dao.ApproveStationPurchaseDAO;
import dao.PurchaseDAO;

public class ApproveStationPurchaseAction extends Action{

		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
 
        ApproveStationPurchaseForm approveStationPurchaseForm = (ApproveStationPurchaseForm) form;
    	
	                    
        ApproveStationPurchaseDAO dao = new ApproveStationPurchaseDAO();
        boolean done=dao.insertPurchase(approveStationPurchaseForm);
       
        
        /*
        if (userName.equals("") || passwd.equals(""))
        {
        	System.out.println("username or password is blank");
            return mapping.findForward("error");
                 	
        }*/
        
        if(!done)
        {
        	System.out.println("insert false ");
        	return mapping.findForward("error");
        }
        
        /*
    	System.out.println("login is retrieved successfully");
    	System.out.println("user exists with the name "+login.getUser().getUsername());
    	System.out.println("user type is "+login.getUser().getUserType().name());
    	System.out.println("putting login into session ");

    	session.setAttribute("login", login);
        */
        
        
       /*ActionRedirect redirect = new ActionRedirect(mapping.findForward("getPurchaseAbstract"));
       return redirect;*/
        
        return mapping.findForward("success");
       
         //return mapping.getInputForward(); //to return to input page
 
    }

}