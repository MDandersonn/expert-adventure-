package Chapter23_InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {

	public static void main(String[] args) {
		/*
		 * FileOutputStream
		 */
		File f= new File("D:\\sample.txt");
		try(FileOutputStream fos = new FileOutputStream(f,true)){//true: append옵션
			fos.write(65);
			fos.write("한글문자열".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
