package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample12 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();

		Sheet sheet = wb.createSheet();
		
		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(1);
		cell1.setCellValue(123);
		
		Row row2 = sheet.createRow(4);
		Cell cell2 = row2.createCell(3);
		cell2.setCellValue("���j��");

		FileOutputStream out = null;
		try {
			out = new FileOutputStream("sample12.xls");
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
