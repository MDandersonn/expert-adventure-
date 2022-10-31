package Chapter21_CalendarClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) throws ParseException {
		/*
		 * Date : 시스템으로부터 현재 날짜, 시간 정보를 가져와서 사용할 수 있게 만들어진 클래스
		 * 
		 * GregorianCalendar: Calendar클래스를 상속하여 작성된 하위클래스로
		 * 	년,월,일,시,분,초,를 다룰수 있게 구성된클래스
		 * 
		 * SimpleDateFormat :날짜및시간정보를 정해진 형식에 맞추어 문자열로 만들어주거나
		 * 	문자열로 만들어진 날짜 및 시간 정보를 Date객체로 만들어주는 클래스
		 * 
		 * 
		 * Date 클래스
		 */
		
		Date date = new Date();
		System.out.println(date);
		
		
		//1970년 1월 1일 0시 0분 0초 부터시작된 현재까지의 밀리초
		long ms = date.getTime();
		System.out.println(ms);

		String year =String.format("%tY",date);
		String month =String.format("%tm",date);
		String day =String.format("%td",date);
		String sday =String.format("%tA",date);
		System.out.println(year+"년 "+month+"월 "+day+"일 "+sday);
		
		
		GregorianCalendar gc =new GregorianCalendar();
//		gc= new GregorianCalendar(2022,1,1);
		gc= new GregorianCalendar(2022,0,1,12,30,0);
		//0부터 1월이다.
		System.out.println( gc.getTime() );
		System.out.println( gc.get(Calendar.YEAR) +"년");//년도만 가져오기
		System.out.println( gc.get(Calendar.MONTH)+1+"월" );
		
	
		System.out.println( gc.get(Calendar.DATE) +"일");
		System.out.println( gc.get(Calendar.DAY_OF_WEEK) +"요일");
		System.out.println(Calendar.YEAR+"이다");
		System.out.println(Calendar.MONTH+"이다");
		System.out.println( Calendar.DATE +"이다");
		int iDay =gc.get(Calendar.DAY_OF_WEEK);
		String sDay=null;
		switch(iDay) {
		case Calendar.SUNDAY:
			sDay="일요일";break;

		case Calendar.MONDAY:
			sDay="월요일";break;

		case Calendar.TUESDAY:
			sDay="화요일";break;

		case Calendar.WEDNESDAY:
			sDay="수요일";break;

		case Calendar.THURSDAY:
			sDay="목요일";break;

		case Calendar.FRIDAY:
			sDay="금요일";break;

		case Calendar.SATURDAY:
			sDay="토요일";break;
			
		}
		System.out.println(sDay);
		System.out.println(Calendar.SATURDAY);
		System.out.println("=======================");
		System.out.println(gc.get(0));
		System.out.println(gc.get(1));//년
		System.out.println(gc.get(2)); //월
		System.out.println(gc.get(3)); //컨트롤클릭으로 뭘의미하는지 찾을수있음
		System.out.println(gc.get(4));
		
		System.out.println("=================================");
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");//형식지정
		String fDate = df.format(new Date());
		System.out.println(fDate);
		
	
		
		
		//문자열을 날짜로 파싱해서 저장해줌 format이랑 문자열형식이랑 매칭이 되어야함.
		String strDate= "2022년 10월 25일 12시 30분 30초";
		Date date1 = df.parse(strDate);
		System.out.println(date1);
		
		
		
		
		
		
		
	}

}
