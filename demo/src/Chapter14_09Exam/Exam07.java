package Chapter14_09Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exam07 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:/abc.txt");
		BufferedReader br= new BufferedReader(new FileReader("d:/abc.txt"));
		ArrayList<String> arr= new ArrayList<>();
		
		while(true) {
			String line=br.readLine();
			
			if(line==null) {
				break;
			}
			arr.add(line);
			System.out.println(line);
		}
		br.close();
//		FileWriter fw = new FileWriter("d:/result.txt");
//		PrintWriter pw =new PrintWriter( new FileWriter("d:/result.txt"));
		PrintWriter pw =new PrintWriter("d:/result.txt");
		for(int i=arr.size()-1 ; i>-1; i--) {
			pw.println(arr.get(i));
			
		}
//		fw.close();
		pw.close();

	}

}
