package TextFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		File F = new File("C:\\Users\\AB73631\\Desktop\\Input.txt");
		FileReader fr = new FileReader(F);
		BufferedReader br = new BufferedReader(fr);
		
		File F1 = new File("C:\\Users\\AB73631\\Desktop\\Output.txt");
		FileWriter fw = new FileWriter(F1);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;

		while ((s = br.readLine()) != null) { // read a line
			
			fw.write(s + "\n"); // write to output file
			//bw.newLine();

		}
		        fw.close();
           System.out.println("file copied");
	}

	}

