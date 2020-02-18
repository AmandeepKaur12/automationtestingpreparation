package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingExcelRow {
	//Assignment to print particular row and particular cell
	
	//Print particular row
	public void readparticularrow(int a) throws BiffException, IOException {
		File f = new File("../21dec219leaarning/src/Data/ExcelTestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=a-1;i<a;i++) {
			for(int j = 0;j<c;j++) {
				
				Cell cs = ws.getCell(j,i);
				System.out.println("Printing a row" + i + " " + cs.getContents());
				
			}
		}
		}
		
		//Print particular cell
		public void readparticularcell(int a,int b) throws BiffException, IOException {
			File f = new File("../21dec219leaarning/src/Data/ExcelTestData.xls");
			Workbook wk = Workbook.getWorkbook(f);
			Sheet ws = wk.getSheet(0);
			int r = ws.getRows();
			int c = ws.getColumns();
			for(int i=a-1;i<a;i++) {
				for(int j = b-1;j<b;j++) {
					
					Cell cs = ws.getCell(j,i);
					System.out.println("readparticularcell" + cs.getContents());
					
				}
			}
	}

	/*
	 * public void readparticularrange(int a,int b) throws BiffException,
	 * IOException { File f = new
	 * File("../21dec219leaarning/src/Data/ExcelTestData.xls"); Workbook wk =
	 * Workbook.getWorkbook(f); Sheet ws = wk.getSheet(0); int r = ws.getRows(); int
	 * c = ws.getColumns(); int lineRangenum =1; int lineRangenum2=1; for(int
	 * i=a-1;i<a;i++) { for(int j = b-1;j<b;j++) { Cell cs = ws.getCell(j,i);
	 * if(lineRangenum2<=a&&lineRangenum<=b) {
	 * //System.out.println(cs.getContents());
	 * System.out.println("Range Content :: " + cs.getContents()); } lineRangenum++;
	 * lineRangenum2++;
	 * 
	 * 
	 * } } }
	 */
	    public static void main(String[] args) throws BiffException, IOException {
	    System.out.println("Enter a number");
	    Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
	    System.out.println("Enter a another number");
		int number1 = scan.nextInt();
		
		
		ReadingExcelRow rp = new ReadingExcelRow();
		rp.readparticularrow(number);
		System.out.println("\n");
		rp.readparticularcell(number, number1);
		System.out.println("\n");
		//rp.readparticularrange(number, number1);


	}

}
