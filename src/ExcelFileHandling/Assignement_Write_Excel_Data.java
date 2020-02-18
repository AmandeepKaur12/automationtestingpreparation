package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignement_Write_Excel_Data {
	
	public void writeExcelData(int a,int b) throws IOException, RowsExceededException, WriteException {

		File f = new File("../21dec219leaarning/src/Data/Assign_WriteExcel.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
        WritableSheet ws = wk.createSheet("TestSheet", 0);
        
        for(int i =0;i<a;i++) { //for reading row
        	for(int j =0;j<b;j++) { //for reading column
        		Label l = new Label(j, i, "AmandeepWrite");
        		ws.addCell(l);
        	}
        	
        }
        wk.write();
    	System.out.println("Filecreated");
    	wk.close();
		
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		Assignement_Write_Excel_Data AWED = new Assignement_Write_Excel_Data();
		AWED.writeExcelData(3,5);

	}

}
