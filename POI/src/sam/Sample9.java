package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample9 {

	public static void main(String[] args) {
		
		FileOutputStream out = null;
		Workbook wb = new HSSFWorkbook();
		
		for (int i=0; i<10; i++) {
			wb.createSheet();
		}
		
		wb.setFirstVisibleTab(5);
		
		try {
			out = new FileOutputStream("sample9.xls");
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
