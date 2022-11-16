package lv0.이진수더하기;

import java.util.ArrayList;
import java.util.List;

public class 이진수더하기 {

	public static void main(String[] args) {
		String bin1 = "1101";
		String bin2 = "11";
		
		int n1 = Integer.parseInt(bin1);
		int n2 = Integer.parseInt(bin2);
		List<String> list1 = new ArrayList<>();
		int temp=0;
		while(!(n1==0 && n2==0)) {
			if(n1%10 + n2%10 +temp ==3) {
				list1.add(0, "1");
				if (temp==0)temp++;
			}
			else if(n1%10 + n2%10 +temp ==2) {
				list1.add(0, "0");
				if (temp==0) temp++;
			}
			else if(n1%10 + n2%10 +temp ==1) {
				list1.add(0, "1");
				temp=0;
			}
			else if(n1%10 + n2%10 +temp ==0) {
				list1.add(0, "0");
				temp=0;
			}
			n1=n1/10; n2=n2/10;
		}
		if(temp !=0) list1.add(0, "1");
		System.out.println(String.join("", list1));
		
		System.out.println("==========================================");
		Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
		
		System.out.println(Integer.parseInt(bin1, 2));

		System.out.println(Integer.toString(16,2));
		System.out.println(Integer.toBinaryString(16));
		
		System.out.println("================================");
		System.out.println("=".repeat(10));
		String answer = "";
        int n = 1;
        int one = 0;
        int two = 0;
        char[] oneArr = bin1.toCharArray();
        char[] twoArr = bin2.toCharArray();
        for(int i = bin1.length()-1; i >= 0; i-- ) {
            one += (oneArr[i]-'0')  * n;
            System.out.println(one);
            n *= 2;
        }
        n = 1;
        for(int j = bin2.length()-1; j >= 0; j-- ) {
            two += (twoArr[j]-'0') * n;
            n *= 2;
        }
        
        
        
        
		
		
	}

}
