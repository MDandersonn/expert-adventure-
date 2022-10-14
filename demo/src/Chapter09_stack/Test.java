package Chapter09_stack;

import java.util.ArrayList;

class stack{
	ArrayList<Integer> arr = new ArrayList<>();
	
	void push(int a) {
		arr.add(a);
		
	}
	void pop() {
		
		System.out.println(arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
		
	}
	void peek() {
		System.out.println(arr.get(arr.size()-1));
		
	}
}

public class Test {

	public static void main(String[] args) {
		stack s1 = new stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);

		s1.peek();
		
		s1.pop();
		s1.peek();


	}

}
