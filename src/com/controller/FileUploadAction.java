package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.model.FileModel;

public class FileUploadAction extends Action{

	
		
	public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            
		FileModel m = (FileModel)form;
		 
        FormFile myFile = m.getFile();
 
        String contentType = myFile.getContentType();
        String fileName = myFile.getFileName();
        int fileSize = myFile.getFileSize();
        byte[] fileData = myFile.getFileData();
        System.out.println("contentType: " + contentType);
        System.out.println("File Name: " + fileName);
 
        HttpSession session = request.getSession(true);
        session.setAttribute("fileName", fileName);
        System.out.println("File Size: " + fileSize);
        return mapping.findForward("uploadSuccess");
    
 
    }

}