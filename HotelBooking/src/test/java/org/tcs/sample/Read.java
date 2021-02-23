package org.tcs.sample;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static String data=null;
	public static void edit() throws Throwable {
		File f = new File("C:\\Users\\Vignesh\\eclipse-workspace\\HotelBooking\\Source\\New Microsoft Office Excel Worksheet.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		XSSFWorkbook f2 = new XSSFWorkbook(f1);
		XSSFSheet sheet = f2.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			 XSSFRow row = sheet.getRow(i);
			 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				 XSSFCell cell = row.getCell(j);
				 int cellType = cell.getCellType();
				 
				 if (cellType==1) {
					 data = cell.getStringCellValue(); 
					
				}
				 else if (cellType==0) {
					double numericCellValue = cell.getNumericCellValue();
					long lg = (long) numericCellValue;
					data = String.valueOf(lg);
				}
				 else {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
					data = simple.format(dateCellValue);
				}
				 
				 
				
				System.out.println(data);
				
				
			}
			
		}
	}

	public static void main(String[] args) throws Throwable {
edit();
	}

}



