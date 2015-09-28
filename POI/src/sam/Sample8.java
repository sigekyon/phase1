package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample8 {

	public static void main(String[] args) {
		FileOutputStream out = null;
		Workbook wb = new HSSFWorkbook();

		Sheet sheet1 = wb.createSheet();
		Sheet sheet2 = wb.createSheet();
		Sheet sheet3 = wb.createSheet();
		
		wb.setActiveSheet(1);
		
		try {
			out = new FileOutputStream("sample8.xls");
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
