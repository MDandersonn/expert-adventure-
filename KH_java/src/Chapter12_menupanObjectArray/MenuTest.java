package Chapter12_menupanObjectArray;

public class MenuTest {

	public static void main(String[] args) {
		MenuClass m1= new MenuClass();
		m1.addMenu("김치찌개", 6000);
		m1.addMenu("제육볶음", 8000);
		m1.addMenu("김밥", 4000);
		m1.addMenu("라면", 5000);
		m1.addMenu("돈까스", 9000);
		m1.addMenu("해장국", 7000);
		System.out.println(m1.showAll());
		m1.modifyMenu("라면", 10000);
		System.out.println(m1.showAll());
		m1.removeMenu("돈까스");
		System.out.println(m1.showAll());
		System.out.println(m1.searchMenu("김밥"));
		
	}

}
