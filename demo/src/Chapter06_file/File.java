package Chapter06_file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File {

	public static void main(String[] args) throws IOException {
		FileOutputStream f1 = new FileOutputStream("D:/out.txt");
		for(int i=0;i<5;i++) {
			String data= i+"번째줄입니다.\n";
			f1.write(data.getBytes());
		
		}
		f1.close();

		
		PrintWriter f3 = new PrintWriter(new FileWriter("D:/out.txt",true));
		for(int i=0;i<5;i++) {
			String data= i+"번째줄입니다!@!.";
			f3.println(data);
			
		
		}
		f3.close();
		
		FileWriter f2 = new FileWriter("D:/out.txt",true);
		for(int i=0;i<5;i++) {
			String data= i+"번째줄입니다잉.\n";
			f2.write(data);
		
		}
		f2.close();
		
		
		
		
		
	}

}
