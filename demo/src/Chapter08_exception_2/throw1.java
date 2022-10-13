package Chapter8_exception_2;



public class throw1 {
    public void sayNick(String nick) throws FoolException {
        
        if("fool".equals(nick)) {
       	//            return;//메서드종료
        	throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
     }

    public static void main(String[] args) {
    	throw1 sample = new throw1();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}
