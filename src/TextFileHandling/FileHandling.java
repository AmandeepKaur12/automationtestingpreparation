package TextFileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
	
		
		File f = new File("C:\\Users\\AB73631\\Desktop\\abc.txt");
		
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n 1.AMandep Text \n");
	    //bw.newLine();
		bw.write("2. Second Line");
		bw.close();
		
		//-- Reading File in java using FIle
		//---- FileReader fr = new FileReader(f);
		/*
		 * BufferedReader br = new BufferedReader(fr); String s ; 
		 * while((s= br.readLine())!=null){ System.out.println(s);
		 * 
		 * }
		 */
		
		//To read character in file using filereader
		
		/*
		 * int a; while ((a= fr.read())!=-1) { System.out.print((char)a);
		 * 
		 * }
		 */
		 
		
		
		
		
		
        
	}

}