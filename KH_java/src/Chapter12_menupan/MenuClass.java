package Chapter12_menupan;

import java.util.Arrays;

public class MenuClass {
	private  String[] menuName;
	private int[] menuPrice;
	
	public MenuClass() {
		
		super();
		menuName= new String[0];
		menuPrice= new int[0];
	}

	public void showAll() {
		System.out.println(Arrays.toString(menuName));
		System.out.println(Arrays.toString(menuPrice));
		
	}
	
	public void addMenu(String menu, int price) {
		String[] tmp = new String[menuName.length+1];
		System.arraycopy(menuName, 0, tmp, 0, menuName.length);
		menuName=tmp;
		menuName[menuName.length-1]=menu;
		
		int[] tmp2 = new int[menuPrice.length+1];
		System.arraycopy(menuPrice, 0, tmp2, 0, menuPrice.length);
		menuPrice=tmp2;
		menuPrice[menuPrice.length-1]=price;
		System.out.println("메뉴가 추가되었습니다.");

		
	}
	public void modifyMenu(String menu, int price) {
		int i=0;
		int idx=0;
		boolean sw=false;
		while(i<menuName.length) {
			if(menuName[i].equals(menu)) {
				idx=i;
				sw=true;
				break;
			}
			i++;
		}
		if(sw==true) {
			menuPrice[idx]=price;
			System.out.println("가격이 수정되었습니다.");
		}else {
			System.out.println("해당 메뉴가 없습니다.");
		}
		
	}
	public void removeMenu(String menu) {
		
		int i=0;
		int idx=0;
		boolean sw=false;
		while(i<menuName.length) {
			if(menuName[i].equals(menu)) {
				idx=i;
				sw=true;
				String[] tmp = new String[menuName.length-1];
				System.arraycopy(menuName, 0, tmp, 0, idx);
				System.arraycopy(menuName, idx+1, tmp, idx, menuName.length-idx-1);
				menuName=tmp;

				int[] tmp2 = new int[menuPrice.length-1];
				System.arraycopy(menuPrice, 0, tmp2, 0, idx);
				System.arraycopy(menuPrice, idx+1, tmp2, idx, menuPrice.length-idx-1);
				menuPrice=tmp2;
				break;
			}
			i++;
		}
		if(sw==true) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("해당 메뉴가 없습니다.");
		}
		
	}
	public int searchMenu(String menu) {
		int i=0;
		int idx=0;
		boolean sw=false;
		while(i<menuName.length) {
			if(menuName[i].equals(menu)) {
				idx=i;
				sw=true;
				break;
			}
			i++;
		}
		if(sw==true) {
			System.out.println("해당 메뉴의 가격은 "+ menuPrice[idx]);
			return menuPrice[idx];
			
		}else {
			System.out.println("해당 메뉴가 없습니다.");
			return 0;
		}
		
	}
	
}
