package Test;

import java.util.HashMap;
import java.util.StringTokenizer;

public class StringtokenizerTest {

	public static void main(String[] args) {
		String str= "10 20 30";
		
		StringTokenizer st =new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
