package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample16 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		Sheet sheet = wb.createSheet();
		
		sheet.setColumnWidth(2, 4096);
		sheet.setColumnWidth(3, 768);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample16.xls");
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
