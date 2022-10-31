package Chapter23_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {

	public static void main(String[] args) {
		/*
		 * FileInputStream
		 *  -바이트기반 스트림으로 바이트단위로 파일을 읽는다. 
		 */
		File f = new File("D:\\sample.txt");
		FileInputStream fis =null;
		try {
			 fis = new FileInputStream(f);
			while(true) {
				int readByte =fis.read();
				System.out.println(readByte);
				if(readByte==-1) break;
				//int반환이지만 byte로 봐야함.
				//-1이 반환이되면 더이상 읽을데이터가없다는것
				System.out.println((char)readByte);
			}
//			fis.close();
			//스트림이열려있으면 문제가생길수있으니 꼭닫아야함
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾지 못하였습니다. ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일읽기작업중 문제가발생");
			e.printStackTrace();
		}finally {
			if(fis !=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
