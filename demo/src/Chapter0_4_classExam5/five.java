package Chapter0_4_classExam5;

import java.util.ArrayList;
import java.util.Arrays;

public class five {

	public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
        System.out.println(a==b);  // true 출력 같은객체
        
        System.out.println("==========");
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b1 = new ArrayList<>(a1);//새로운 객체생성
        a1.add(4);
        System.out.println(b1.size());  // 3 출력
        System.out.println(a1 == b1);  // false 출력 다른객체
    }

}
