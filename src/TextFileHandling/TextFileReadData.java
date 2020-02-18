package TextFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadData {
	
	//To read specific Data line at position 3
		public void ReadData(int a) throws IOException {
		
		File f = new File("../21dec219leaarning/ReadWriteTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		int lineno = 1;
		String s;
		while((s= br.readLine())!=null) {
			if(lineno ==a) {
				System.out.println("String at position 3 is :: " + s);
			}
			lineno++;
		}
		
		}	
		
		//To read specific Data line at position 3 and 7
		public void ReadDataRange(int a,int b) throws IOException {
			int lineRangenum=1;
			File f = new File("../21dec219leaarning/ReadWriteTextFile.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			while((s= br.readLine())!=null) {
				if(lineRangenum>=a&&lineRangenum<=b) {
					System.out.println("String at position 3 and 7 is :: " + s);
				}
				lineRangenum++;
			}			
			}

	

	public static void main(String[] args) throws IOException {
		TextFileReadData tfrD= new TextFileReadData();
		// 	//To read specific Data line at position 3
		
		System.out.println("Enter first Number");
		Scanner scan = new Scanner(System.in);
		int linenumber1 = scan.nextInt();
		
		System.out.println("Enter second Number");
		int linenumber2 = scan.nextInt();
		
		tfrD.ReadData(linenumber1);
		tfrD.ReadDataRange(linenumber1, linenumber2);
		
		

	}

}
