package kadai2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Results({
    @Result(name="success", location="input.jsp")
})
public class InputAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Action("input")
    public String input(){

        System.out.println("AAA");
       return ActionSupport.SUCCESS;
    }

}
