package javaPractice;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadXLS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String fileName="C:\\Users\\Nilesh\\Desktop\\MY_DATA\\Test.xls";
		
		XSSFWorkbook Workbook=new XSSFWorkbook();
		
		XSSFSheet sheet0=Workbook.createSheet("MySheet");
		Row row0=sheet0.createRow(0);
		
		Cell CellA=row0.createCell(0);
		

	}

}
