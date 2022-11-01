package Chapter24_SubStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SubStreamClass {

	public static void main(String[] args) {
		/*
		 * 보조스트림
		 *  - 입출력에서 사용하는 기반 스트림을 보조하는 역할을 수행하는 스트림
		 *  -보조스트림을 사용하기 위해서는 반드시 기반 스트림과 같이 사용해야 함
		 *  -보조스트림은 기반스트림의 성능 또는 추가기능을 제공하여 입출력을 보다 효율적으로 사용하기 위한 용도로 쓰인다.
		 *  
		 * 문자보조스트림
		 * -InputStreamReader /OutpuuStreamWriter 이 있으며, 바이트 기반 스트림에
		 * 	적용하여 사용
		 * -바이트 데이터를 문자 데이터로 변환하는 기능을 제공
		 * 
		 * 
		 * 버퍼보조스트림
		 * 	-BufferedInputStream /BufferedOutputStream 이 있으며 바이트기반 스트림에 적용하여 사용
		 *  -BufferedReader / BufferedWriter 이 있으며 문자기반스트림에 적용하여 사용
		 *  -하드디스크와 메모리 사이의 입출력 속도차를 보완하기 위한 중간 완충 영역을 만들어서
		 *  	병목현상을 최소화하여 원활한 입출력이 이루어 질수있도록 제공한다. 
		 *  
		 *    
		 * 데이터 타입 보조 스트림
		 * -DataInputStream /DataOutputStream이 있으며 바이트 기반 스트림에 적용하여 사용
		 * -프로그램에서 사용하는 기본 데이터타입을 그대로 입출력에 사용할 수 있도록 하는 기능 제공.
		 * 
		 * 
		 * 객체타입 보조 스트림
		 *  - ObjectInputStream/ ObjectOutputStream이 있으며 바이트 기반 스트림에 적용하여 사용
		 *  -프로그램에서 사용하는 객체 타입을 그대로 입출력에 사용할 수 있도록 하는 기능 제공
		 *  
		 *  
		 */

		File f= new File("D:\\sample2.txt");
		StringBuilder sb= new StringBuilder();
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(f))){
			char[] buf= new char[8];
			while(true) {
				int readCount = isr.read(buf);//별도의 변환과정이 필요없게됨
				if(readCount==-1) break;
				sb.append(buf,0,readCount);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb.toString());
	
		
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f,true))){
			osw.write("\n문자열 그대로 출력에 사용\r\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
