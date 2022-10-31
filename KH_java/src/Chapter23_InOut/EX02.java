package Chapter23_InOut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class EX02 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String subject=br.readLine();
			String[] subjectArr =subject.split(",");
			System.out.println(Arrays.toString(subjectArr));
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
