package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a file class to open excel
				String filename = "E:\\Work\\JavaLearningClasses5\\SeleniumLeraning\\Quotes.xlsx";
				File file = new File(filename);
				//Create i/p stream class object
				FileInputStream inputStream = new FileInputStream(file);
				//Determine Filetype
				String extenstion = filename.substring(filename.indexOf("."));
				//Create book
				Workbook book = null;
				if(extenstion.equals(".xlsx")){
					book = new XSSFWorkbook(inputStream);
				} else if(extenstion.equals(".xls")){
					book = new HSSFWorkbook(inputStream);
				}
				//Select sheet
				Sheet sheet = book.getSheet("Sheet1");
				//Find rows
				int rowNo = sheet.getPhysicalNumberOfRows();
				//Create loop to print cell values
				
				for(int i=1;i<rowNo;i++){
					Row row = sheet.getRow(i);
					//Read Columns
					int lastCellNo = row.getLastCellNum();
					for(int j=0;j<row.getLastCellNum();j++){
						
						int type = row.getCell(j).getCellType();

						if(type==0){ //Number
							System.out.print(row.getCell(j).getNumericCellValue()+ " ");
						} else if(type ==1){ //String
							System.out.print(row.getCell(j).getStringCellValue()+" ");
						} else if(type ==2){ //Formula 
							System.out.print(row.getCell(j).getCachedFormulaResultType()+" ");
						} else if(type ==3){ //Empty
							System.out.print(row.getCell(j).getStringCellValue()+ " ");
							System.out.print("  EmptyCell  ");
						} else if(type==4){ //Boolean
							System.out.print(row.getCell(j).getBooleanCellValue()+ " ");
						}
						
						if(row.getLastCellNum()== lastCellNo){
							//Writing in last cell
							row.createCell(row.getLastCellNum()).setCellValue("ABC");
						}
					}
					System.out.println();
				}
				
				FileOutputStream fout = new FileOutputStream(file);
				book.write(fout);
				fout.close();

	}

}
