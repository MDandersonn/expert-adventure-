package Chapter08_exception;

class FoolException extends RuntimeException {
}
//class FoolException extends Exception {
//}

public class RuntimeException1 {
    public void sayNick(String nick) {
        
        if("fool".equals(nick)) {
       	//            return;//메서드종료
        	throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
     }

    public static void main(String[] args) {
    	RuntimeException1 sample = new RuntimeException1();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}
