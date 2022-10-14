package Chapter06_exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		 FileWriter fw = new FileWriter("sample.txt");
	        fw.write("Write once, run anywhere");
	        fw.close();
	        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
	        String line = br.readLine();
	        System.out.println(line);  // null 이 출력된다.
	        br.close();

	}

}
