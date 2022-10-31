package Chapter20_StringClass;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num= null;
		do {
			System.out.print ("전화번호를 입력하세요:");
			num= sc.nextLine();
			if( num.startsWith("010-") ) {
				if(num.split("-").length-1 ==2 ) {
					//010-9853-9993
					if(num.length()==13 && num.substring(3,4).equals("-")&& num.substring(8,9).equals("-")) {
						System.out.println(num.substring(0,9)+"****");
						break;
					}
				}
			}
			
		}while(true);
		
		

	}

}
