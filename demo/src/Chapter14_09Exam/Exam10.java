package Chapter14_09Exam;
import java.util.Random;

class OddException extends Exception {
}
public class Exam10 {
	 static void execute(int n) {
	     try {   
	    	 System.out.printf("입력 숫자: %d\n", n);
	        if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
	            throw new OddException();
	        }
	        System.out.println("짝수입니다.");
	     }catch (OddException e) {
	            e.printStackTrace();
	        }
	    }
	 	//main에서 try catch를 작성하려면 메서드에 throws를 달아야함
	    public static void main(String[] args) {
	        Random r = new Random();
	       
	            for (int i = 0; i < 10; i++) {
	                execute(r.nextInt(10));
	            }
	      
	    }
}
