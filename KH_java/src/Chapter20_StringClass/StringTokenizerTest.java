package Chapter20_StringClass;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		/*	StringTokenizer
		 *  문자열을 특정 구분 문자를 기준으로 분리하는 클래스
		 *  
		 *  
		 *  String str= "A,B,C,D,E";
		 *  
		 *  StringTokenizer sToken = new StringTokenizer(str
		 *  
		 *  
		 *  
		 */
		 String str= "A,B,C,D,E";
		 StringTokenizer sToken = new StringTokenizer(str,",");
		 while(sToken.hasMoreTokens()) {
			 System.out.println(sToken.nextToken());
		 }
		 
		 
	}

}
