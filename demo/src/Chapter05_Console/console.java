package Chapter5_Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class console {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
//		int a = in.read();//1바이트만 읽는다.
//		System.out.println(a);
//		
		
//		byte[] arr =new byte[3];
//		in.read(arr);
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		InputStreamReader r1 = new InputStreamReader(in);
		char[] arr =new char[3];
		r1.read(arr);
		System.out.println(arr);

		BufferedReader b1 = new  BufferedReader(r1);
		String k =b1.readLine();
		System.out.println(k);
		
		System.out.println("일반 출력");
        System.err.println("에러 출력");
	}

}
