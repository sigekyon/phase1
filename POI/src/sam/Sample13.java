package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample13 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		Sheet sheet0 = wb.createSheet();
		Sheet sheet1 = wb.createSheet();
		Sheet sheet2 = wb.createSheet();
		Sheet sheet3 = wb.createSheet();
		
		sheet2.setSelected(true);
		sheet3.setSelected(true);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample13.xls");
			wb.write(out);
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
