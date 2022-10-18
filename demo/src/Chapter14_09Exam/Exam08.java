package Chapter14_09Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exam08 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/javaFile/abcd.txt");
		BufferedReader br = new BufferedReader(fr);
		int cnt=0;
		int sum=0;
		while(true) {
			String str=br.readLine();
			
			if(str==null) {
				break;
			}
			sum +=Integer.parseInt(str);
			cnt++;
			
		}
		System.out.println(cnt);
		System.out.println(sum);
		br.close();
		fr.close();
		
		PrintWriter pw = new PrintWriter("D:/javaFile/result2.txt");
		pw.println("합계: "+sum);
		pw.println("평균: "+ (double)(sum)/cnt);
		pw.close();
		
		

	}

}
