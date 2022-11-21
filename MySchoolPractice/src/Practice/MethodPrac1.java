package Practice;

public class MethodPrac1 {
	 void varTest(int a) {
	        a++;
	    }//a를 k로바꾼다면? ㅋㅋㅋ 밑에 변수 a랑 다른메서드의 매개변수로 준 a는 다르지.
	 
	 	//단, 메소드에 값을전달하는것과 객체를전달하는것은 큰 차이가 있음.
	    public static void main(String[] args) {
	        int a = 1;
	        MethodPrac1 sample = new MethodPrac1();
	        sample.varTest(a);
	        System.out.println(a);
	    }

}
