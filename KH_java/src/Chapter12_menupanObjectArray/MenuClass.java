package Chapter12_menupanObjectArray;

import java.util.Arrays;

public class MenuClass {
	private Food[] fd= new Food[0];//FOOD클래스 배열 (객체배열)
	
	public String showAll() {
		String str="";
		for(int i=0;i<this.fd.length;i++) {
			str+=String.format("%s\t%,d\n",this.fd[i].menuName,this.fd[i].menuPrice);
		}
		return str;
		
	}
	
	
	
	
	public void addMenu(String menu, int price) {

		this.fd=Arrays.copyOf(this.fd, this.fd.length+1);
		this.fd[this.fd.length-1]=new Food(menu,price);
		System.out.println("메뉴가 추가되었습니다.");

		
	}
	public void modifyMenu(String menu, int price) {
		int i=0;
		int idx=0;
		boolean sw=false;
		while(i<fd.length) {
			if(fd[i].menuName.equals(menu)) {
				idx=i;
				sw=true;
				break;
			}
			i++;
		}
		if(sw==true) {
			fd[idx].menuPrice=price;
			System.out.println("가격이 수정되었습니다.");
		}else {
			System.out.println("해당 메뉴가 없습니다.");
		}
		
	}
	public void removeMenu(String menu) {
		
		int i=0;
		int idx=0;
		boolean sw=false;
		while(i<fd.length) {
			if(fd[i].menuName.equals(menu)) {
				idx=i;
				sw=true;
				Food[] tmp = new Food[fd.length-1];
				System.arraycopy(fd, 0, tmp, 0, idx);
				System.arraycopy(fd, idx+1, tmp, idx, fd.length-idx-1);
				fd=tmp;

		
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
		while(i<fd.length) {
			if(fd[i].menuName.equals(menu)) {
				idx=i;
				sw=true;
				break;
			}
			i++;
		}
		if(sw==true) {
			System.out.println("해당 메뉴의 가격은 "+ fd[idx].menuPrice);
			return fd[idx].menuPrice;
			
		}else {
			System.out.println("해당 메뉴가 없습니다.");
			return 0;
		}
		
	}
	
}
