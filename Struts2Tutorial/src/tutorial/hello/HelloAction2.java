package tutorial.hello;

import com.opensymphony.xwork2.ActionSupport;

import dao.testDAO;

public class HelloAction2 {



    public String doHello() {
        return ActionSupport.SUCCESS;
    }


    public String doHello2() {

        testDAO dao = new testDAO();
        dao.selectData();

        return ActionSupport.SUCCESS;
    }


}