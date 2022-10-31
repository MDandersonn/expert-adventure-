package Chapter20_StringClass;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * String : 문자열 클래스로 문자열 데이터를 다루기 위해 사용한다
		 * 수정 불가능(불변타입) 으로 데이터 수정 시 원본 데이터를 복사하여
		 * 새로운 문자열 데이터로 만드는 형식으로 사용
		 * 
		 * StringBuilder :문자열 클래스로 String의 불변타입을 변경가능으로 
		 * 	사용할 수 있게 만들어진 클래스이다.
		 * 	Thread Safe 기능을 제공하지 않음. 
		 * 
		 * StringBuffer : 위 클래스와 동일한 기능을 제공
		 * 	Thread safe기능을 제공함.
		 * 	thread safe기능은 멀티쓰레드 작업에 활용할 때 공유 자원에 대한 안정성을
		 * 	높여 주기 위해 사용하는 기능
		 * 
		 * 
		 * 
		 */
		
		String str3 = new String(new char[] {'문','자','열'});
		System.out.println(str3);
		
		
		//codePointAt():문자열에서 매개변수로 전달한 정수값의 위치에 해당하는 문자
		
		int code =str3.codePointAt(1);
		System.out.println(code+" "+(char)code );
		
		
		
		String str1 ="A";
		String str2= "B";
		int compare =str1.compareTo(str2);
		System.out.println(compare);
		//값이 -1이면 기준이 앞에있다는 얘기 str1이 더 str2보다 사전순으로 앞에있다는얘기
		compare = str2.compareTo(str1);
		System.out.println(compare);
		
		
		//대소문자무시.
		str1.compareToIgnoreCase(str2);
		
		
		//concat(): 문자열 합치기
		System.out.println(str1.concat(str2));
		
		//contains():
		str1="가 나 라";
		str2="나";
		System.out.println(str1.contains(str2));
		
		//contentEquals(): 동일한지 확인 //Equals랑 다른점은 StringBuffer를 활용함.
		System.out.println(str1.contentEquals(str2));
		
		//시작 또는끝 일치
		str1="Start eis gagnanana eis sdod";
		str2="start";//대소문자까지 같아야 true가나옴.
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.endsWith(str2));
		
		
		//대소문자
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		
		//인덱스위치 반환 (문자열의 시작위치)
		System.out.println(str1.indexOf("eis"));
		//indexOf(찾을문자,어디지점부터찾을지)
		System.out.println(str1.indexOf("eis",7));
		System.out.println(str1.indexOf("eis",21));
		//없으면 -1출력
		
		//문자열에서 사용자가 지정한 문자열이 몇개 있는지 출력하시오.
		System.out.println("======================");
		int i=-1;
		int sum=0;
		do {
			
			i =str1.indexOf("eis",i+1);
			if (i==-1) break; 
			sum++;
				}while(true);
		System.out.println(sum+"개 ");
		//lastindexOf 뒤에서부터찾음
		
		//isblank는 공백 " "은 비어있다고 취급 
		//isEmpty는 공백도 문자로 취급
		
		
		str1 =" 문자열에 \n개행이 있으면 \n개행을 기준으로 \n분리하는 메서드";
		Stream<String> st = str1.lines();
		Object objArr[] = st.toArray();
		
		for(int j=0; j<objArr.length ; j++) {
			String s = (String)objArr[j];
			System.out.println(s);
		}
		
		String strArr[] = str1.split("\\n");
		
		for(int j=0; j<strArr.length ; j++) {
			String s = strArr[j];
			System.out.println(s);
		}
		str1= "가나다라 마바사 아자자차 카타타자";
		strArr= str1.split(" ",3);
		System.out.println(Arrays.toString(strArr));
		
		//repeat
		
		str1="aka ";
		System.out.println(str1.repeat(5));
		
		//replace
		str1= "aka aka aka";
		System.out.println(str1.replace("k","o"));
		
		//replaceAll :정규표현식에해당하는것을 지정한문자로바꾸겟다

		System.out.println(str1.replaceAll("k","o"));
		
		///regex:정규표현식
		str1= "         aka aka aka        ";
		System.out.println("l"+str1.strip()+"l"); //문자앞뒤로 존재하는 공백을 제거
		System.out.println("l"+str1.stripLeading()+"l");//왼쪽공백제거
		System.out.println("l"+str1.stripTrailing()+"l");//오른쪽공백제거
		System.out.println("l"+str1.trim()+"l");
		//strip() 메소드는 trim() 보다 더 많은 종류의 공백을 제거할 수 있습니다.
		
		
		//문자열자르기.
		str1="아에이오우";
		System.out.println(str1.substring(1,2));
		
		System.out.println(String.format("%s 입니다",str1));
		System.out.println(String.join(":","가","나","다"));
		
		String[] sarr=  {"마","사","아"};
		System.out.println(String.join(":",sarr));
		
		
		System.out.println(String.valueOf(2424));
		String a =String.valueOf(24.24); //스트링으로 만들어줌
		System.out.println(a);
		
		
		
		/* str1.substring()이런거는 인스턴스메서드
		 * String.join 은 클래스매서드(정적 매서드) 
		 */
		
	}
	

}
