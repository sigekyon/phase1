package sam;

import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample{
  public static void main(String[] args){
//    HSSFWorkbook workbook = new HSSFWorkbook();
	XSSFWorkbook workbook = new XSSFWorkbook();

    workbook.createSheet("test");

    FileOutputStream out = null;
    try{
//      out = new FileOutputStream("sample.xls");
      out = new FileOutputStream("sample.xlsx");
      workbook.write(out);
    }catch(IOException e){
      System.out.println(e.toString());
    }finally{
      try {
        out.close();
      }catch(IOException e){
        System.out.println(e.toString());
      }
    }
  }
}