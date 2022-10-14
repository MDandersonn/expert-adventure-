package que;

import java.util.ArrayList;

class que{
	ArrayList<Integer> arr = new ArrayList<>();
	
	void enque(int a) {
		arr.add(a);
		
	}
	void deque() {
		
		System.out.println(arr.get(0));
		arr.remove(0);
		
	}
	
	void showAll() {
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}

}

public class test {

	public static void main(String[] args) {
		que s1 = new que();
		s1.enque(1);
		s1.enque(2);
		s1.enque(3);
		
		s1.deque();
		
		s1.showAll();

	}

}
