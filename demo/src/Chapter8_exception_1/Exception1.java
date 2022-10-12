package Chapter8_exception_1;

//class FoolException extends RuntimeException {
//}
class FoolException extends Exception {
}

public class Exception1 {
    public void sayNick(String nick) {
        try{
        	if("fool".equals(nick)) {
        	
//            return;//메서드종료
        		throw new FoolException();
        	}
        	System.out.println("당신의 별명은 "+nick+" 입니다.");
    	}catch(FoolException e) {
    		System.err.println(e);
    	}
   }

    public static void main(String[] args) {
    	Exception1 sample = new Exception1();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}
