package Chapter01_Variable;

public class Variable {

	public static void main(String[] args) {
		/**
		 * 클래스나 메서드에 대한 설명을 작성하기 위한 용도
		 * @param args :매개변수에대한 설명
		 */
		
		//$와 _ 는 변수에 사용가능
		int $num=10;
		int _num=20;
		System.out.println($num+_num);//30출력

		//주의메시지
		//사용하지않는데 메모리를 차지하고있으면 노랑전등모양이 뜬다.

		//지역변수
		//메서드와 같은 중괄호 영역에 만들어진 변수. 지역변수는 해당영역을 벗어나면 더이상 사용할 수없다.
		//점유하던 메모리 공간이 사라진다.

		//변수선언
		int i1;

		//선언한 변수에 데이터 할당(저장,초기화)
		i1=10;

		//이미 초기화 한 변수에 데이터 재할당
		i1=20;
		
		//변수선언후 즉시 초기화
		int i2=30;
		
		//변수 선언만 하고 초기화(initialized)하지않은경우 에러가 난다. 
		int i3;
		//System.out.println(i3);
		
		/**
		 * 바이트수 정리
		 * byte 1    -128~ 127  
		 * short 2  -32768~ 32767
		 * int 4	-2147483648~2147483647
		 * long 8
		 * 
		 * float 4
		 * double 8
		 * 
		 * char 2
		 * boolean 1
		 * String 참조형  
		 * 
		 */
		long lg1 = 9231231241525L; //L붙여야함
		float ft1 = .3f; // 0을 생략가능, f붙여야함
		char c1 =65;// 정수형으로써도 문자로인식함
		int c2= 'A';// 문자형으로써도 정수로인식  문자는 작은따옴표,  문자열String 은 큰따옴표사용
		System.out.println(c1); //A출력
		System.out.println(c2);//65출력
		
		
		
	}
	

}


