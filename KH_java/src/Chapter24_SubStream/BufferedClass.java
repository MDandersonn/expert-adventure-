package Chapter24_SubStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedClass {

	public static void main(String[] args) {
		File f= new File("D:\\sample2.txt");
		
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br =new BufferedReader(new FileReader(f))){
			while(br.ready()) {
//				sb.append(br.readLine());//개행문자 빼고 가져옴
				sb.append(br.readLine()+"\r\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb.toString());
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
			bw.write("버퍼 보조 스트림을 적용하여 입출력");
			bw.newLine(); //자동으로 개행들어가게함
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
