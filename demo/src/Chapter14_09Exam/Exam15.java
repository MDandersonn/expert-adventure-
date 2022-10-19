package Chapter14_09Exam;

public class Exam15 {

	public static void main(String[] args) {
		String str ="cat cat";
		int num =5;
		
		char [] arr =str.toCharArray();
		for(char s : arr) {
			if(s==' ') {
				System.out.print(' ');
				
			}else {
				char result= (char) (s+num);
				System.out.print(result);
			}
		}
		

	}

}
