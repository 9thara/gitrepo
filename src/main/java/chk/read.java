package chk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {

	public static void main(String args[]) throws IOException {
		File Excel=new File("C:\\Users\\vijayalakshmi.k\\Downloads\\excel.xlsx");
		FileInputStream fi=new FileInputStream(Excel);
		XSSFWorkbook w = new XSSFWorkbook(fi);
		XSSFSheet s=w.getSheetAt(0);
		System.out.println(s.getLastRowNum());
		Row row =s.getRow(1);
		System.out.println(row.getLastCellNum());
		Cell cell=row.getCell(1);
		System.out.println(cell);
	}
}
