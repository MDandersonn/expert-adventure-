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
//		String[] tmp = new String[menuName.length+1];
//		System.arraycopy(menuName, 0, tmp, 0, menuName.length);
//		menuName=tmp;
//		menuName[menuName.length-1]=menu;
				
		//answer
		this.menuName=Arrays.copyOf(this.menuName, this.menuName.length+1);
		this.menuName[this.menuName.length-1]=menu;
		
		
//		int[] tmp2 = new int[menuPrice.length+1];
//		System.arraycopy(menuPrice, 0, tmp2, 0, menuPrice.length);
//		menuPrice=tmp2;
//		menuPrice[menuPrice.length-1]=price;
		
		//answer
		this.menuPrice=Arrays.copyOf(this.menuPrice, this.menuPrice.length+1);
		this.menuPrice[this.menuPrice.length-1]=price;
		
		
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
	
	/*//본배열의 i랑  복사배열의 j의 증감을 다르게하여 중간에 하나 뺴고 복사가 가능하다.
	 * 
	 * String tmp[]= new String(this.menuName.length-1];
	 * for(int i=0,j=0; i<this.menuName.length; i++){
	 * 		if(!this.menuName[i].equals(menu)){
	 * 			tmp[j]=this.menuName[i];
	 * 			j++;
	 * 		}
	 * }
	 * this.menuName =tmp;
	 */
	
	
	
	
	
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
