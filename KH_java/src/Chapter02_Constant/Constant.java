package Chapter02_Constant;

public class Constant {

	public static void main(String[] args) {
		/**
		 * 상수: 변수는 변수 공간에 언제든 데이터를 수정할수있는 공간으로 사용
		 * 상수는 한번 초기화를 하면 더 이상 수정할 수 없는 공간으로 사용
		 * 상수명을 작성할때는 변수명과의 구분을 위해 대문자로만 작성
		 * 또한 두 단어 이상의 조합으로 상수명을 작명할 때에는 카멜케이스 방식을 사용할수 없기에 _문자를 사용하는 스네이크케이스 방식 사용
		 * 
		 * 카멜케이스: projectExplorer
		 * 스네이크케이스: PROJECT_EXPLORER
		 * 
		 * 상수를 선언할 때에는 변수선언방식과 동일하며 단, 자료형 앞에 final 키워드를 사용
		 * 
		 */
		final int PROJECT_EXPLORER =20;
		//PROJECT_EXPLORER=30; 에러
		final int GIT_REPOSITORIES;//선언만.
		GIT_REPOSITORIES =30;  //위에 , 선언만했기 떄문에 초기화가능
		
		
	}

}
