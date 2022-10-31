package Chapter23_InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) {
		/*
		 * FileReader
		 * -문자기반입력스트림으로 문자 단위로 파일을 읽는다.
		 * 
		 */
		File f = new File("D://sample.txt");
		try(FileReader fr = new FileReader(f)){
			char[] buffer = new char[8];
			StringBuilder sb= new StringBuilder(64);// 모자르면 알아서늘어남
			
			
			while(true) {
				int readChar = fr.read(buffer);
				System.out.println(readChar);
				System.out.println(buffer);
				if(readChar ==-1) {
					break;
				}
//				sb.append(buffer); // 문제점.
				sb.append(buffer,0,readChar); //해결
				
			}
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
