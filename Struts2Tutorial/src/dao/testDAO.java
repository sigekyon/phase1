package dao;

public class testDAO {

    public int selectData() {
        testVO vo = new testVO();
        return vo.getA()+vo.getB();
    }
}
