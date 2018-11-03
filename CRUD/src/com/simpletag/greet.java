package com.simpletag;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class greet extends SimpleTagSupport
{
	public void doTag() throws JspException, IOException 
	{
		getJspContext().getOut().print("Royal");
	}
}
