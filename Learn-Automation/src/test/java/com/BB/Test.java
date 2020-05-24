package com.BB;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		ExcelData ed=new ExcelData();
		Object[][] data=ed.xlsxReaderManyRowsManyColumnsR();
		for(int i=0;i<1;i++) {
			for(int j=0;j<1;j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}

}
