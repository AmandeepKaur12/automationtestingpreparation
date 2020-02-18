package ExcelFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataRead {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		//general practicse code for reading data frome xcel and text file

		File fq = new File("../21dec219leaarning/src/Data/Input.txt");
        File f = new File("../21dec219leaarning/src/Data/ExcelTestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				Cell cs = ws.getCell(j,i);
				System.out.println(cs.getContents());
			}
		}
		
		//for text file
		FileReader fr = new FileReader(fq);
		BufferedReader br = new BufferedReader(fr);
		int a;
		
		//for single character
//		while((a=fr.read())!=-1) {
//			//System.out.println(a);
//			System.out.println((char)a);			
//		}
		
		//For Line
		String s;
		while((s=br.readLine())!=null) {
			System.out.println(s);			
		}
		
		
	}

}
