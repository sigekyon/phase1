package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class Sample15 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		Sheet sheet0 = wb.createSheet();
		Sheet sheet1 = wb.createSheet();
		Sheet sheet2 = wb.createSheet();
		
		sheet1.setZoom(2, 1);
		sheet2.setZoom(3, 4);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample15.xls");
			wb.write(out);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
