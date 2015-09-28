package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample10 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		wb.createSheet("Sheet0");
		wb.createSheet("Sheet1");
		wb.createSheet("Sheet2");
		
		wb.setSheetOrder("Sheet2", 1);
		wb.setSheetOrder(wb.getSheetName(2), 0);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample10.xls");
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
