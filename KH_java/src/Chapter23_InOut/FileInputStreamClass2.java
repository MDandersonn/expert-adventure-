package Chapter23_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamClass2 {

	public static void main(String[] args) {
		/*
		 * FileInputStream
		 *  -바이트기반 스트림으로 바이트단위로 파일을 읽는다. 
		 */
		File f = new File("C:\\sample.txt");
		
		try (FileInputStream fis =new FileInputStream(f)){//알아서 close진행
			byte[] buffer = new byte[8];
			byte[] datas = new byte[(int)f.length()];
			int offset=0;
			System.out.println("처음 buffer배열:"+Arrays.toString(buffer));
			System.out.println("바이트수 : "+ (int)f.length());//바이트수
			while(true) {
				int readByte =fis.read(buffer);//일정크기만큼 읽어서 바이트배열에 저장하여 활용
				if(readByte==-1) break;
				//int반환이지만 byte로 봐야함.
				//-1이 반환이되면 더이상 읽을데이터가없다는것
			
				System.out.println("읽은바이트 수:"+readByte);//8바이ㅌ,8,8,8,8,8,8,2 바이트읽음.
				System.out.println("buffer배열:"+Arrays.toString(buffer));
				System.arraycopy(buffer, 0, datas, offset, readByte);
				offset +=readByte;
			}
			System.out.println();
			System.out.println("================");
			System.out.println(Arrays.toString(datas));
			System.out.println(new String (datas));
			System.out.println(datas);
			
//			fis.close();
			//스트림이열려있으면 문제가생길수있으니 꼭닫아야함
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾지 못하였습니다. ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일읽기작업중 문제가발생");
			e.printStackTrace();
		}

	}

}
