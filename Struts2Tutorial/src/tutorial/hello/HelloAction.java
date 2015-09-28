package tutorial.hello;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction {

    public static final String FIRST_MESSAGE = "テキストボックス初期値";

    private String message = FIRST_MESSAGE;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String doHello() {
        return ActionSupport.SUCCESS;
    }


}