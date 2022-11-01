package Chapter25_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
class Subject  implements Comparable<Subject> {
	private String name;
	private double score;
	public Subject(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public int compareTo(Subject o) {
		if(this.score>o.score) {//양수를 반환하면 오름차순
			return 1;
			
		}else if ( this.score <o.score) {
			return -1;
		}
		return 0;
	}
	
}


public class CollectionClass {

	public static void main(String[] args) {
		/*
		 * 컬렉션
		 * -자바에서 제공하는 자료구조를 담당하는 프레임워크
		 * -배열에 데이터를 담아 관리하는 방법에서 자료구조를 적용하여 좀 더 효율적으로 데이터를 관리할 수 있도록 다양한 기능제공
		 * -구현된 자료구조 종류에 따라 List,Set,Map 등으로 분류하여 제공
		 * 
		 * 배열vs 컬렉션
		 * 
		 * 배열특징
		 * 	- 한번 크기를 정하면 변경할 수 없다.
		 *  - 배열에 저장된 데이터의 추가/ 수정 / 삭제 과정이 불편하다.
		 *  - 한가지 타입에 대해서만 저장할 수 있다.(다형성을 사용하면 여러 타입 저장 가능)
		 *  
		 * 컬렉션특징
		 *  - 언제든 크기를 늘리거나 줄일 수 있다.
		 *  -컬렉션에 저장된 데이터의 추가 /수정/ 삭제 등의 과정은 기본제공하는 메서드에 의해 처리가 이루어진다.
		 *   - 여러 타입에 대한 데이터자장이 가능하다. 
		 *   
		 *  List 계열 컬렉션
		 *  -데이터를 순차적으로 나열한 자료구조로 되어 있으며 인덱스로 관리한다. 
		 *  -중복데이터 저장 가능
		 *  -구현 클래스로는 ArrayList, vector , LinkedList가 있다.
		 *  
		 *  ArrayList
		 *  -List의 구현체로 초기 저장용량 10에서 데이터가 추가/삭제 될때마다
		 *    	자동으로 늘어나면서 데이터를 관리한다.
		 *  -  thread safe 기능을 제공하지 않는다.
		 *  
		 *  Vector 
		 *   -ArrayList와 동일하며 Thread Safe기능을 제공한다.
		 *  LinkedList 
		 *   - 특정 위치에 데이터를 추가하거나 제거하면 앞 뒤 노드의 링크 정보만 변경하는 형태로 동작하며 이로 인해 빈번한 데이터의 
		 *   	추가/수정에 가장 우서한 성능을 가지는 List컬렉션이다.
		 *   
		 */
		ArrayList<Integer> aList =new ArrayList<>();
		//제네릭타입 : 객체에서 사용할 일반 객체타입을 지정하기 위해 쓰임.
		aList.add(Integer.valueOf(10));aList.add(Integer.valueOf(20));aList.add(Integer.valueOf(30));
		aList.add(Integer.valueOf(40));
		
		System.out.println(aList);
		aList.add(60);
		System.out.println(aList);
		aList.add(4,50);//4번인덱스에 50 추가.
		System.out.println(aList);
		
		//수정
		
		aList.set(4, 45); //4번인덱스를 45로수정.
		System.out.println(aList);
		
		aList.remove(3); //3번인덱스값 삭제
		System.out.println(aList);
		
		aList.remove(Integer.valueOf(60)); //특정 값을 찾아서삭제.(60)이라고쓰면안됨
		System.out.println(aList);
		
		System.out.println(  aList.get(1) ); //1번인덱스값 리턴
		
		System.out.println(aList.contains(45)); //특정값 데이터 있는지 확인
		System.out.println(aList.indexOf(45));  //특정 값의 인덱스반환
		System.out.println(aList.size());// 어레이크기 확인 
		
		
		// 다른 리스트계열 컬렉션에 저장된 데이터를 추가
		ArrayList<Integer> bList =new ArrayList<>();
		bList.add(100);bList.add(200);bList.add(300);bList.add(400);
		
		aList.addAll(bList);//깊은 복사임
		System.out.println(aList);
		
		bList.set(0, 150);//원본 수정해도 복사본에 영향을안준다
		System.out.println(aList);
		
		
		bList.clear();//전부삭제
		System.out.println(bList);
		
		System.out.println(aList.isEmpty()); //비어있는지 확인
		System.out.println(bList.isEmpty());		
		
		//전체 탐색
		System.out.println("==========================");
		System.out.println(aList);
		for(int i=0;i<aList.size();i++) {
			System.out.println(aList.get(i));
			aList.set(i, aList.get(i)+1);
			
		}
		System.out.println(aList);
		System.out.println(aList.getClass());
		System.out.println(bList.getClass());
		for(Integer a : aList) {//일괄수정작업할수없다 제네릭 <Integer>잘써줘야 작동한다.
			System.out.println(a);
		}
		
		ArrayList<Integer> cList = new ArrayList<>(aList.subList(3, 7)); // 리스트의 특정부분 잘라서 리스트만들기
		//3번인덱스부터 6번인덱스까지잘르기
		System.out.println(aList);
		System.out.println(cList);
		
		//리스트를 Object배열로 반환
		Object[] objArr = aList.toArray();
		for(int n=0; n<objArr.length; n++) {
			Integer num =(Integer)objArr[n];
			System.out.println(num);
		}
		
		//리스트에 저장된 객체 타입에 맞추어 배열로 반환
		Integer[] iArr = aList.toArray(new Integer[aList.size()]);
		//aList를 Integer배열로 만드는것 toArray(배열객체)
		for(int n=0; n<iArr.length; n++) {
			int num =iArr[n];
			System.out.println(num);
		}
		
		
		//역순 -reverse
		Collections.reverse(aList); //역순으로 저장시킴
		System.out.println(aList);
		
		//정렬-sort(오름차순)
		Collections.sort(aList);
		System.out.println(aList);
		//내림차순은 sort하고 역순으로하면됨
		
		
		System.out.println("+===========================");
		//역순으로정렬
		aList.sort(Comparator.reverseOrder());
		System.out.println(aList);
		//오름차순정렬
		aList.sort(Comparator.naturalOrder());
		System.out.println(aList);
		
		
		//사용자 정의 객체를 리스트에 이용
		ArrayList<Subject> sList =new ArrayList<>();
		sList.add(new Subject("국어",100));
		sList.add(new Subject("수학",50));
		sList.add(new Subject("영어",60));
		
		System.out.println(sList);
		Collections.sort(sList);
		System.out.println(sList);
		
		//리스트 계열의 컬렉션들이기 떄문에 동일한 기능 지원
		//내부동작은 다름.
		
		List<Integer> qList = new ArrayList();
		qList= new Vector<>();
		qList= new LinkedList<>();
		
		
		
	}

}
