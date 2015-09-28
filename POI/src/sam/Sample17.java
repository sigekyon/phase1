package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample17 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		Sheet sheet0 = wb.createSheet();
		Sheet sheet1 = wb.createSheet();
		
		sheet0.setDisplayGridlines(true);
		sheet1.setDisplayGridlines(false);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample17.xls");
			wb.write(out);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				out.close();
			} catch(IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
