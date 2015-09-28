package mytaglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport{

    public void doTag() throws JspException, IOException {
        String string = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        getJspContext().getOut().print(string);
    }
}