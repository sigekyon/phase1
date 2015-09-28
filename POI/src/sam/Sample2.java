package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample2 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample2_1.xls");
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
