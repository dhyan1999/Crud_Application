package com.simpletag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Meet extends SimpleTagSupport
{
	public void doTag() throws JspException, IOException 
	{
		getJspContext().getOut().print("Meet.....");
	}
}
