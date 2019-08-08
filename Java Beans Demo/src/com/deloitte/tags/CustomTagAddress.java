package com.deloitte.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {

	private static final long serialVersionUID = 2540891205643500326L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h1>Deloitte USI</h1>");
			out.println("<h3>Campus C-2, Divyashree Technopolis</h3>");
			out.println("<h3>Yemlur, Off old airport road, Bengaluru</h3>");
			out.println("<h3>Karnataka  - 560075</h3>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
