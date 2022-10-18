package Chapter14_09Exam;



public class Exam11 {
	
	public void DashInsert(String str) {
	
		
		
	}
	public static void main(String[] args) {
		String str="4546793";
		int i=0;
		String str2="";
		str2 += str.charAt(0);
		
		while(i<str.length()-1) {
			int n = Character.getNumericValue(str.charAt(i));  //char ->int
			int nn = Character.getNumericValue(str.charAt(i+1));
			
			if(n%2==0) {
				if(nn%2==0) {
					str2+= "*"+Character.forDigit(nn,10);// int ->char
				}else {
					str2+= Character.forDigit(nn,10);
				}
				
			}else {
				if(nn%2==1) {
					str2+= "-"+Character.forDigit(nn,10);
					
				}else {
					str2+= Character.forDigit(nn,10);
				}
				
			}
			i++;
		}
		System.out.println(str2);
		System.out.println('0'+1);//0의 아스키코드값+1
		System.out.println((char)('0'+1));
		int a= (char)('0'+1);
		System.out.println(a);//아스키코드값
		char b= (char)('0'+1);
		System.out.println(b); // 문자1
		char c= (char)(48+1);
		System.out.println(c);//아스키코드값49의 문자.
	}

}
