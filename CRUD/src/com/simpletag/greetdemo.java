package com.simpletag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class greetdemo extends SimpleTagSupport
{
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print("Greeting Royal");
	}
}
