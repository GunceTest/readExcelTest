package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel extends PageBase{

	 public ReadExcel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 
	 
	 //"C:\\Users\\Gun\\Desktop\\ExpenseTotalAmount.xlsx"
	 
	 public ReadExcel loadAndReadExcel() throws IOException {
		 
		 	sleep(6);
		  //File source = new File("C:\\Users\\Gun\\Downloads\\ExpenseTotalAmount.xlsx");
		 //Jenkins için asagidaki calistiliacak
		 	File source = new File("C:\\Users\\guncetest.otomasyon\\Downloads\\ExpenseTotalAmount.xlsx");
		  FileInputStream fileInputStream = new FileInputStream(source);
		  sleep(3);
		  XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
		  sleep(3);
		  XSSFSheet sheet = wb.getSheetAt(0);
		  sleep(3);
		  String cellValue = sheet.getRow(2).getCell(3).getStringCellValue();
		  System.out.println("Excel karsilastirmasi icin referans alinacak dosya numarasi: "+ cellValue);
		  System.setProperty("referans_dosya_no", cellValue);
		  wb.close();
		 return this;

	 }
}