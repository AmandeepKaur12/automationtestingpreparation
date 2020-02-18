package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.io.WriteAbortedException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteinExcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("../21dec219leaarning/src/Data/WriteExcel.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
        WritableSheet ws = wk.createSheet("TestSheet", 0);
        
        for(int i =0;i<5;i++) {
        	for(int j =0;j<5;j++) {
        		Label l = new Label(j, i, "Amandeep");
        		ws.addCell(l);
        	}
        	
        }
        wk.write();
    	System.out.println("Filecreated");
    	wk.close();
		
	}

}
