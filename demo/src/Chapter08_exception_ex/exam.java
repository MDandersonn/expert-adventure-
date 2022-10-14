package Chapter08_exception_ex;
class sendException extends Exception{}


public class exam {
	public void packaging() throws sendException{
		System.out.println("포장");
	}
	public void receipt(String str)throws sendException{
		if("err".equals(str)) {
			throw new sendException();
		}
		System.out.println("영수증");
	}
	public void dispatch()throws sendException{
		System.out.println("발송");
		
	}
	public static void main(String[] args) {
		try {
			exam a = new exam();
			
			a.packaging();
			a.receipt("err");
			a.dispatch();
		}
		catch(sendException e ) {
			System.out.println("실패");
		}
		
		
	}

}
