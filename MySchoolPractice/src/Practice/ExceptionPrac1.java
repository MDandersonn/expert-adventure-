package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Error extends RuntimeException{
	
}

public class ExceptionPrac1 {
	
	public static void method1(int a) throws Error, IOException {
//		try {
			if(a==1){
				throw new Error();
			}
			else System.out.println("good");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
			BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
			br.readLine();
			br.close();
		
	}
		

	public static void main(String[] args) {
		
		try {
			method1(2);//good
			method1(1);//Error발생 
			System.out.println("kkk");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
