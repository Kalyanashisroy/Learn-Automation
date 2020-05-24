package com.BB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExcelData {
	WebDriver driver;
	public static String excelpath = "C://Users//KALYANASHIS//eclipse-workspace//Learn-Automation//TestData//DataExcel.xlsx";

	public static DataFormatter formatter = new DataFormatter();

	// 1 start
	@Test(dataProvider = "Dataprovider_MROW_MCOL", enabled = false)
	void runtogetmanyrowsandmanycolumns(String s1, String s2, String s3) {
		// System.out.println("##"+s1);
		// System.out.println("##"+s2);
		// System.out.println("##"+s3);

	}

	@DataProvider(name = "Dataprovider_MROW_MCOL")
	static Object[][] xlsxReaderManyRowsManyColumns() throws IOException {
		Object[][] data = xlsxReaderManyRowsManyColumnsR();
		return data;

	}
	// 1 end
	
	// 2 start
	@Test(dataProvider = "Dataprovider_oneTargetROW_ManyTargetColumns", enabled = true)
	void runtogetonerow(String s1)
	
	{
		
		// System.out.println("##"+s1);
		// System.out.println("##"+s2);
		// System.out.println("##"+s3);

		if (s1.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (s1.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (s1.equals("Opera")) {
			System.setProperty("webdriver.opera.driver", "D:\\Browser\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
		} else if (s1.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Browser\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@DataProvider(name = "Dataprovider_oneTargetROW_ManyTargetColumns")
	static Object[][] xlsxReaderOneRowCall() throws IOException {
		String xlsxfilepath = excelpath;
		String xlsxsheetname = "Sheet3";
		int nthRow = 1;
		int noofcolumns = 1;
		Object[][] data = xlsxReaderOneRow(xlsxfilepath, xlsxsheetname, nthRow, noofcolumns);
		return data;

	}// 2 end

	// 3 start
	@Test(dataProvider = "Dataprovider_firstrow_manyColumns", enabled = false)
	void runtogetonerowcustomcolumn(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
	}

	@DataProvider(name = "Dataprovider_firstrow_manyColumns")
	static Object[][] xlsxCallfirstRowManyColumns() throws IOException {
		String xlsxfilepath = "C://Users//KALYANASHIS//eclipse-workspace//Learn-Automation//TestData//DataExcel.xlsx";
		String xlsxsheetname = "Sheet2";
		int firstRow = 1;
		int noofcolumns = 7;
		Object[][] data = xlsxReaderOneRow(xlsxfilepath, xlsxsheetname, firstRow, noofcolumns);
		return data;

	}
	// 3 end

	///////////// excel reader starts from here

	static Object[][] xlsxReaderOneRow(String filepath, String sheetname, int nthRw, int noofCol) throws IOException {
		File file = new File(filepath);
		FileInputStream filestream = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(filestream);
		XSSFSheet worksheet = workbook.getSheet(sheetname);
		int ColNum = noofCol;
		Object Data[][] = new Object[1][ColNum]; // pass my  count data in array

		// for(int i=RowNum; i<RowNum-1; i++) //Loop work for Rows
		// {
		int i = 0;
		XSSFRow row = worksheet.getRow(nthRw - 1);

		for (int j = 0; j < ColNum; j++) // Loop work for colNum
		{
			if (row == null)
				Data[i][j] = "";
			else {
				XSSFCell cell = row.getCell(j);
				if (cell == null)
					Data[i][j] = ""; // if it get Null value it pass no data
				else {
					String value = formatter.formatCellValue(cell);
					Data[i][j] = value; // This formatter get my all values as string i.e integer, float all type data
										// value

				}
			}
		}
		// }

		return Data;

	}

	//////////////////

	static Object[][] xlsxReaderManyRowsManyColumnsR() throws IOException {
		File file = new File(excelpath);
		FileInputStream filestream = new FileInputStream(file);
		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(filestream);
		// Get first/desired sheet from the workbook
		// XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		// Iterate through each rows one by one
		XSSFRow Row = worksheet.getRow(0);
		int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
		int ColNum = Row.getLastCellNum(); // get last ColNum
		Object Data[][] = new Object[RowNum - 1][ColNum]; // pass my  count data in array
		for (int i = 0; i < RowNum - 1; i++) // Loop work for Rows
		{
			XSSFRow row = worksheet.getRow(i + 1);

			for (int j = 0; j < ColNum; j++) // Loop work for colNum
			{
				if (row == null)
					Data[i][j] = "";
				else {
					XSSFCell cell = row.getCell(j);
					if (cell == null)
						Data[i][j] = ""; // if it get Null value it pass no data
					else {
						String value = formatter.formatCellValue(cell);
						Data[i][j] = value; // This formatter get my all values as string i.e integer, float all type
											// data value

					}
				}
			}
		}

		return Data;

	}

	///////////// excel reader ends
    /////////////   Single cell reader
   String xlsxSingleCellReader(int nthRw, int noofCol) throws IOException{
   File file = new File(excelpath); // excel file path
   FileInputStream filestream = new FileInputStream(file);
   XSSFWorkbook workbookd = new XSSFWorkbook(filestream);
   XSSFSheet worksheet = workbookd.getSheet("Sheet3");  // sheet name
   int ColNum=noofCol;
       XSSFRow row= worksheet.getRow(nthRw-1);
 	   XSSFCell cell= row.getCell(ColNum -1);
	   String value=formatter.formatCellValue(cell);
	   return value;
      } 
    //////Single Cell reader

}
