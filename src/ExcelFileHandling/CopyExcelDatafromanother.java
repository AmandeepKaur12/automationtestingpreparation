package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CopyExcelDatafromanother {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File f = new File("../21dec219leaarning/src/Data/CopyWriteExcelTestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		File fwrite = new File("../21dec219leaarning/src/Data/ExcelTestData.xls"); 
		WritableWorkbook wk1 = Workbook.createWorkbook(fwrite);
        WritableSheet ws1 = wk1.createSheet("TestSheet", 0);
		
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				Cell cs = ws.getCell(j,i);
				//System.out.println(cs.getContents());
				Label l = new Label(j,i,cs.getContents());
				ws1.addCell(l);
			}
		}
		wk1.write();
    	System.out.println("Filecreated");
    	wk1.close();
	}
	

}
