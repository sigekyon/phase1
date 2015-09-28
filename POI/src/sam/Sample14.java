package sam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample14 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("sample.xls");
			wb = WorkbookFactory.create(in);
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (InvalidFormatException e) {
			System.out.println(e.toString());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		
		Sheet sheet = wb.getSheetAt(0);
		
		Row row = sheet.getRow(2);
		sheet.removeRow(row);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample14.xls");
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
