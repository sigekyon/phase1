package sam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample7 {

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
		
		wb.removeSheetAt(1);
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample7.xls");
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
