package Chapter25_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		/*
		 * Set계열 컬렉션
		 *  - 저장순서를 유지하지 않는다.
		 *  - 중복을 허용하지 않는다
		 *  - 구현클래스로 HashSet, LinkedHashSet, TreeSet등이 있다
		 *  
		 * HashSet
		 * -객체를 저장할 때 hash함수를 사용하여 처리 속도가 빠르다.
		 * -동일 객체 뿐 아니라 동등 객체도 중복하여 저장하지 않는다.
		 * 
		 * LinkedHashSet
		 * - HashSet과 동일하지만 Set에 추가되는 데이터들의 순서가 유지된다.
		 * 
		 * TreeSet
		 * -검색기능을 강화한 컬렉션으로 계층 구조를 활용해 이진 트리 자료구조로 구현되어있다.
		 */

		HashSet<Integer> aSet= new HashSet<>();
		aSet.add(10);aSet.add(20);
		aSet.add(40);aSet.add(30);
		System.out.println(aSet);
		HashSet<Integer> bSet= new HashSet<>();
		bSet.add(1);bSet.add(2);
		bSet.add(4);bSet.add(3);
		aSet.addAll(bSet);
		
		System.out.println(aSet);
		//다른건 리스트와 동일한데
		//데이터수정이없다 그냥 삭제하고 다시넣어라.
		//for each문을 사용하여 전체 탐색가능
		
		
		//set컬렉션을 list컬렉션으로 변경
		List<Integer> list1 = new ArrayList<>(aSet);
		System.out.println(list1);
		
		//list를 set으루
		
		Set<Integer> cSet= new HashSet<>(list1);		
		
	}

}
