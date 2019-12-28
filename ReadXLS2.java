package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLS2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File ("C:\\Users\\Nilesh\\Desktop\\MY_DATA\\Test.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook workbook=WorkbookFactory.create(fi);
		
		Sheet sheet0=workbook.getSheetAt(0);
		
		Row row0=sheet0.getRow(0);
		
		Cell cellA=row0.getCell(0);
		System.out.println(cellA);

	}

}
