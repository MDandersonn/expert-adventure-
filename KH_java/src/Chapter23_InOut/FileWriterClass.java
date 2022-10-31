package Chapter23_InOut;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) {
		/*
		 * FileWriter
		 */
		
		File f = new File("D:\\sample.txt");
		try(FileWriter fw = new FileWriter(f,true)){
			fw.write("문자기반출력");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
