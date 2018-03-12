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

public class LoginAction extends Action{

	private String forwardActionValue;
		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
 
    	LoginForm loginform = (LoginForm) form;
	    String userName=loginform.getUsername();
	    String passwd=loginform.getPassword();
    	       
                
        LoginDAO dao = new LoginDAO();
        Login login=dao.getLogin(loginform);
       
        if (userName.equals("") || passwd.equals(""))
        {
        	System.out.println("username or password is blank");
            return mapping.findForward("error");
                 	
        }
        else if(login==null)
        {
        	System.out.println("login is null");
        	return mapping.findForward("error");
        }
        else if(login.getUser().getUserType()==UserType.GOVTSHIPPINGOFFICIAL)
        	forwardActionValue="govtshippingofficialloginsuccess";
        else if(login.getUser().getUserType()==UserType.STATION)
        	forwardActionValue="stationLoginSuccess";
        
    	System.out.println("login is retrieved successfully");
    	System.out.println("user exists with the name "+login.getUser().getUsername());
    	System.out.println("user type is "+login.getUser().getUserType().name());
    	System.out.println("putting login into session ");

    	session.setAttribute("login", login);
        
        return mapping.findForward(forwardActionValue);
 
    }

}