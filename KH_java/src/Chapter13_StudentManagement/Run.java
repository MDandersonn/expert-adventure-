package Chapter13_StudentManagement;

import java.util.Scanner;

public class Run {
	public void start() {
		Scanner sc= new Scanner(System.in);
		System.out.println("학생 성적을 관리하기 위한 프로그램");
		Student st=new Student();
		boolean sw=false;
		while(true) {
			if (sw==true) {
				break;
			}
			System.out.println("학생 성적관리메뉴");
			System.out.println("1. 성적표출력");
			System.out.println("2.과목성적출력");
			System.out.println("3.과목성적추가");
			System.out.println("4.과목성적수정");
			System.out.println("5.과목성적삭제");
			System.out.println("6.프로그램종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			int num =sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				st.showAll();
				System.out.println("초기메뉴로 돌아가려면 Enter 입력!");
				String s1 =sc.nextLine();
				if (s1.equals("\n")){
					continue;
				}
				break;
				
			case 2:
				while(true) {
					System.out.print("성적 출력할 과목명 :");
					String sub =sc.nextLine();
					
					if (sub.equals("exit")) {
						System.out.println("추가작업을 마칩니다.");
						break;
					}
					st.getSubjectScore(sub);
				}
				System.out.println("초기메뉴로 돌아가려면 Enter 입력!");
				String s2 =sc.nextLine();
				
				break;
				
				
				
			case 3:
				while(true) {
					System.out.print("추가할 과목명 :");
					String sub =sc.nextLine();
					
					if (sub.equals("exit")) {
						System.out.println("추가작업을 마칩니다.");
						break;
					}
					System.out.print("성적입력(0~100) :");
					int score =sc.nextInt();
					sc.nextLine();
					st.addSubject(sub,score);
				}
				System.out.println("초기메뉴로 돌아가려면 Enter 입력!");
				String s3 =sc.nextLine();
				
				break;
			case 4:
				while(true) {
					System.out.print("수정할 과목명 :");
					String sub =sc.nextLine();
					if (sub.equals("exit")) {
						System.out.println("추가작업을 마칩니다.");
						break;
					}
					System.out.print("성적입력(0~100) :");
					int score =sc.nextInt();
					sc.nextLine();
					st.modifyScore(sub, score);
				}
				System.out.println("초기메뉴로 돌아가려면 Enter 입력!");
				String s4 =sc.nextLine();
				break;
				
				
				
			case 5:
				while(true) {
					System.out.print("삭제할 과목명 :");
					String sub =sc.nextLine();
					if (sub.equals("exit")) {
						System.out.println("추가작업을 마칩니다.");
						break;
					}
					st.removeSubject(sub);
				}
				System.out.println("초기메뉴로 돌아가려면 Enter 입력!");
				String s5 =sc.nextLine();
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다");
				sw=true;
				break;
			}
			
		}
	}
	

}
