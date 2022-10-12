package Chapter6_exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exam05 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> arr = new ArrayList<>();
		FileReader fr =new FileReader("d:/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line =br.readLine();
			
			//line을 안쓰고 br.readLine();을 쓰면안된다
			//br.readLine();이 나올때마다 다음줄로 가기때문이다.
			if( line==null) {
				break;
			}
			arr.add( line);
		}
		br.close();
		String str= String.join("\n",arr);
		str=str.replaceAll("python", "java1");
		
		FileWriter fw = new FileWriter("d:/sample.txt");
		fw.write(str);
		fw.close();
		
		
		
		
		
	}

}
