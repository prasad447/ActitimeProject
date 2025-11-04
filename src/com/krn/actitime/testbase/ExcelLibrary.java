package com.krn.actitime.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	
	public  String getExcelData(String sheetName,int getRowNumber,int cellNumber) {
		
		
		       String rtv="";
		
		
		try {
			FileInputStream fis=new FileInputStream("F:\\selenium practice\\Real Time Project\\data\\data.xlsx");
			
			//System.out.println("output file");
			      Workbook wb=  WorkbookFactory.create(fis);
			      
			       Sheet sh= wb.getSheet(sheetName);
			       
			       Row r=sh.getRow(getRowNumber);
			       
			        Cell c=r.getCell(cellNumber);
			               rtv = c.getStringCellValue();
			               System.out.println(rtv);
			               

	
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rtv;
		
		
		
	}
	  public int getLastRow(String sheetNumber) throws FileNotFoundException {
		  
		  int rtv=0;
		  
	FileInputStream fis=new FileInputStream("F:\\selenium practice\\Real Time Project\\data\\data.xlsx");
			
			//System.out.println("output file");
			      try {
					Workbook wb=  WorkbookFactory.create(fis);
					
					Sheet sh= wb.getSheet(sheetNumber);
					
					      rtv=  sh.getLastRowNum();
					
					
					
					
					
					
					
					
					
				} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rtv;
				
		  
		  
		  
		  
		  
		  
	  }
			


}
