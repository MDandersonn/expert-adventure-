package Chapter6_exam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("d:/sample.txt",true);
		PrintWriter f2= new PrintWriter(new FileWriter("d:/sample.txt",true));
		Scanner sc= new Scanner(System.in);
		System.out.println("입력하세요: ");
		String str = sc.nextLine();
		f2.println(str);
		f2.close();

	}

}
