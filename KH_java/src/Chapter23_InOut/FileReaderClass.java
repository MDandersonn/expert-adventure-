package Chapter23_InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderClass {

	public static void main(String[] args) {
		/*
		 * FileReader
		 * -문자기반입력스트림으로 문자 단위로 파일을 읽는다.
		 * 
		 */
		File f = new File("D://sample2.txt");
		try(FileReader fr = new FileReader(f)){
			char[] buffer = new char[8];
			StringBuilder sb= new StringBuilder(64);// 모자르면 알아서늘어남
			
			
			while(true) {
				int readChar = fr.read(buffer);
				System.out.println("readChar:"+readChar);
				System.out.println("buffer:"+Arrays.toString(buffer));
				if(readChar ==-1) {
					System.out.println("readchar가-1일때 buffer배열:"+Arrays.toString(buffer));
					break;
				}
//				sb.append(buffer); //  8바이트씩읽다가 짤려서 2바이트남는경우 나머지 6바이트도 위에읽었던걸 읽게됨
				sb.append(buffer,0,readChar); //8바이트씩읽다가 마지막에 남은 바이트수가 2라하면  readChar가 2가된다.
				System.out.println("sb:"  +sb);
				//그럼 2까지 0~8을읽는게아니라 0~2로읽고 끝내라는것.   0부터~readChar까지라는 뜻. 
				//0자리는 항상 0으로 쓴다. 
				
				//버퍼배열의 0인덱스부터 readChar인덱스전까지 sb에 넣는다는뜻
				
			}
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
