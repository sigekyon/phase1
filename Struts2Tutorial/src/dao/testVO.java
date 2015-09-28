package dao;

import java.io.Serializable;

public class testVO implements Serializable{

    private static final long serialVersionUID = 1L;

    private int a = 1;
    private int b = 2;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }


}
