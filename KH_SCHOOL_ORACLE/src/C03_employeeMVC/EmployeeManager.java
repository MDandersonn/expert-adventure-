package C03_employeeMVC;
import java.util.Scanner;

import C04_DepartmentMVC.DepartmentController;


public class EmployeeManager {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	private DepartmentController dc = new DepartmentController();
	
	
	public void start() {
		while(true) {
			this.printMenu();
			System.out.print("메뉴 번호 입력 : ");
			int menuNumber = 0;
			if(sc.hasNextInt()) {
				menuNumber = sc.nextInt(); sc.nextLine();
				this.selectMenu(menuNumber);
			}
		}
	}

	private void selectMenu(int menuNumber) {
		switch(menuNumber) {
			case 1:
				// 전체 사원 조회
				ec.getAll(); break;
			case 2:
				// 전체 부서 조회
				dc.getAll();
				break;
			case 3:
				// 전체 직무 조회
				break;
			case 4:
				// 사원 정보 추가 수정 삭제
				break;
			case 5:
				// 부서 정보 추가 수정 삭제
				break;
			case 6:
				// 직무 정보 추가 수정 삭제
				break;
			case 7:
				// 프로그램 종료
				System.exit(0);
		}
	}

	private void printMenu() {
		System.out.println("[1] 전체 사원 정보 출력");
		System.out.println("[2] 전체 부서 정보 출력");
		System.out.println("[3] 전체 직무 정보 출력");
		System.out.println("[4] 사원 정보 추가 수정 삭제");
		System.out.println("[5] 부서 정보 추가 수정 삭제");
		System.out.println("[6] 직무 정보 추가 수정 삭제");
		System.out.println("[7] 프로그램 종료");
	}

}
