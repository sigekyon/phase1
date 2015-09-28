package sam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {

	public static void main(String[] args) {
		FileInputStream in = null;
		Workbook wb = null;
		
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
		
		Sheet sheet = wb.createSheet("new sheet");
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample4.xls");
			wb.write(out);			
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
