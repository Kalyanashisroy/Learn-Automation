package com.Utility;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\KALYANASHIS\\eclipse-workspace\\Learn-Automation\\TestData\\DataExcel.xlsx");
		System.out.println(excel.getData(4, 0, 1));
	}

}
