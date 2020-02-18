package TextFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextWriteData {
	
	public void writeData(String text) throws IOException {
		File f = new File("../21dec219leaarning/WriteTextFile.txt");
		f.createNewFile();
		FileWriter fr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(text);
		br.newLine();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		
	
		
		TextWriteData TWD = new TextWriteData();
		TWD.writeData("My NAme is Amandeep Kaur. \n I amd SOftware professional");
		

	}

}
