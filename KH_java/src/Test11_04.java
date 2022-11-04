import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test11_04 {

	public static void main(String[] args) {
		int num = Integer.parseInt("10");
		double num2 = Double.parseDouble("13.45");
		System.out.println(num);
/*
 * 	현재시스템 날짜 및 시간에 대한 정보를 보관할 Date 객체 생성한 후에,
 *  SimpleDateFormat 클래스를 이용하여 
"2021년 02월 15일 11시 30분 50초"의 형식으로 출력될 수 있는 코드를 기술하시오. (12점)
 */
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String s = sdf.format(new Date());
		System.out.println(s);
		
		FileWriter fw =null;
		try {
			fw=new FileWriter("D:\\sample6.txt",true);
			fw.write(97);
			fw.write(65);
			fw.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
