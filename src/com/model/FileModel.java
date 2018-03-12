package com.model;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class FileModel extends ActionForm{
	private FormFile file = null;
	 
    public void setFile(FormFile file) {
        this.file = file;
    }
 
    public FormFile getFile() {
        return this.file;
    }
}
