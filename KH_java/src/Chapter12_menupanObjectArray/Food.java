package Chapter12_menupanObjectArray;

public class Food {
	String menuName;
	int menuPrice;
	
	public Food(String menuName) {
		super();
		this.menuName = menuName;
	}

	public Food(String menuName, int menuPrice) {
		this(menuName);//위의 생성자호출
		this.menuPrice = menuPrice;
	}

	

}
