package Chapter6_Scanner;

import java.util.Scanner;

//control shift o 입력

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		System.out.print("정수입력: ");
		int x1 = sc.nextInt(); //sc.nextLine();
		System.out.print(x1);

		System.out.print("실수값 입력: ");
		double x2 = sc.nextDouble();
		System.out.print(x2); //sc.nextLine();
		
		System.out.println(sc.nextLine());
		System.out.print("문자열 입력 : ");
		String s1 =sc.nextLine();//왜 입력을 안받고 바로 밑으로 넘어가는가?? 
		System.out.print(s1+" 입니다");
		
		/**
		 * 정수나 실수입력후에 sc.nextLine();을 해야 된다.  왜 입력해야하는가?
		 * 사용자입력값은  input Buffer에 저장이 된다. 여기에 저장되있는거를
		 * sc.nextint , sc.nextline할때 버퍼에 저장되어있는게 있는지 확인해보는데 
		 * sc.nextint에
		 * 10을입력하면 10\n 이 입력된다. 그럼 10만을 가져간다. 
		 * \n이 버퍼에 남아있게된다. 그러면 \n을 sc.nextLine 할때 가져와서 제거해주어야한다.
		 * sc.nextLine 을 안쓰면 \n이 누적되어 입력버퍼안에 게속 있을것. 
		 * 
		 * 
		 */
		

	}

}
