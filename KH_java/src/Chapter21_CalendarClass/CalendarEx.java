package Chapter21_CalendarClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) throws ParseException {
		/*
		 *22년 10월중 주말에 해당하는 날짜 배열 출력 
		 */
		
		SimpleDateFormat sd1 =new SimpleDateFormat("yyyy/MM/dd");
		String result = sd1.format(new Date());
		System.out.println(result);
		
		String[] arr =new String[0];
		int j=0;
		for (int i=1 ;i<=31 ;i++) {
			GregorianCalendar gc = new GregorianCalendar(2022,9,i);
//			System.out.println( gc.getTime() );
//			System.out.println(gc.get(Calendar.MONTH)+1);
			int iDay =gc.get(Calendar.DAY_OF_WEEK);
			if(iDay == Calendar.SUNDAY || iDay == Calendar.SATURDAY ) {
				arr=Arrays.copyOf(arr, arr.length+1);
				arr[j]=""+ gc.get(Calendar.DATE);
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 입력하세요 ex)1999/12/12 : ");
		String str = sc.nextLine();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		Date dt= sf.parse(str);
		
		System.out.println(dt); 
		
		Date dtNow=  new Date();
		System.out.println(dtNow);
		long r1 = dtNow.getTime() -dt.getTime() ;
		double second = (double)r1/1000;       //초
		double day = second/(60*60*24);
		System.out.println("D-day: "+ (double)day);
		
//		dtNow.getDay();
//		dtNow.get(Calendar.HOUR_OF_DAY);
//System.out.println(Calendar.HOUR_OF_DAY);
		GregorianCalendar gc =new GregorianCalendar();
		
		
		
		
//		
//		String date1="20220101";
//		 String date2="20220102";
//
//		 DateFormat format = new SimpleDateFormat("yyyyMMdd");
//
//		 /* Date타입으로 변경 */
//
//		 Date d1 = format.parse( date1 );
//		 Date d2 = format.parse( date2 );
//		 long Sec = (d1.getTime() - d2.getTime()) / 1000; // 초
//		 long Min = (d1.getTime() - d2.getTime()) / 60000; // 분
//		 long Hour = (d1.getTime() - d2.getTime()) / 3600000; // 시
//		 long Days = Sec / (24*60*60); // 일자수
//	        
//		 System.out.println(Sec + "초 차이");
//		 System.out.println(Min + "분 차이");
//		 System.out.println(Hour + "시 차이");
//		 System.out.println(Days + "일 차이");
	}
	
	
	

}
