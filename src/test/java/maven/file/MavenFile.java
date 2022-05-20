package maven.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenFile {

	public static void main(String[] args) throws IOException, InterruptedException{
		/*File f=new File("C:\\Users\\Dell\\Desktop\\Java driver files\\Test.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<physicalNumberOfRows;i++)
		{
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<physicalNumberOfCells;j++)
			{
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1)
				{
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(DateUtil.isCellDateFormatted(cell))
				{
					Date dateCellValue = cell.getDateCellValue();
					System.out.println(dateCellValue);
					SimpleDateFormat s= new SimpleDateFormat("MM/dd/yyyy");
					String format = s.format(dateCellValue);
					System.out.println(format);
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
				}
			}
		}*/
		/*File f= new File("C:\\Users\\Dell\\Desktop\\Java driver files\\Test.xlsx");
		FileOutputStream stream= new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Xls File");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Maven FrameWork");
		w.write(stream);*/
		
		/*File f= new File("C:\\Users\\Dell\\Desktop\\Java driver files\\Test.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Xls File");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.contains("DataDriven FrameWork"))
		{
			cell.setCellValue("Java Testing");
		}
		FileOutputStream streaout=new FileOutputStream(f);
		w.write(streaout);*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*//driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(findElement);
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='text']"));
		findElement2.sendKeys("1234");*/
		WebElement findElement = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		findElement.click();
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.id("day"));
		Select s= new Select(findElement2);
		s.selectByIndex(10);
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.id("month"));
		Select s1= new Select(findElement3);
		s1.selectByValue("4");
		Thread.sleep(3000);
		WebElement findElement4 = driver.findElement(By.id("year"));
		Select s2= new Select(findElement4);
		s2.selectByVisibleText("2017");
		
		
		
		
		
		
		
	
		

	}

}
