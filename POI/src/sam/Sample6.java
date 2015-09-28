package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample6 {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();
		
		Sheet sheet1 = wb.createSheet();
		Sheet sheet2 = wb.createSheet();
		Sheet sheet3 = wb.createSheet();
		
		wb.setSheetName(1, "2014year");
		wb.setSheetName(2, "�݌Ƀe�[�u��");
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("sample6.xls");
			wb.write(out);
		} catch (IOException e){
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
