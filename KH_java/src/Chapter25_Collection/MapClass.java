package Chapter25_Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		/*
		 *키와 값으로 구성되어있으며 키와 값모두 객체이다
		 *키에대해서는 중복저장을 허용하지않으며 값은 중복가능
		 *구현클래스호 HashMap ,HashTable,Properties등이 있다
		 *
		 *HashMap
		 *키 객체는 hashCode()와 equals()를 재정의해 동등 객체가 될 조건을 정해야한다.
		 *키는 주로 String 객체를 사용한다
		 *
		 *HashTable
		 *-HashMap과 동일하고 Thread Safe기능을 지원한다
		 *
		 *Properties
		 *- 키와 값을 String타입으로 제한한 Map컬렉션
		 *주로 프로퍼티 파일을 읽어 그 안의 속성을 프로그램에서 사용할 수 있게 만들기 위해 쓰인다
		 *-프로퍼티 파일은 주로 어플리케이션이 동작하는 과정에서 어플리케이션이 초기동작에
		 *필요한 값이나 설정 값을 읽어서 사용할 수 있게 만들어져 있다.
		 *(어플리케이션이 처음 동작할때 데이터베이스 연결과 관련된 프로퍼티 파일을 읽어서 연결을 시도)
		 * 
		 */
		HashMap<String,Integer> aMap = new HashMap<>();
		aMap.put("A",Integer.valueOf(10));
		aMap.put("B",Integer.valueOf(20));
		aMap.put("C",Integer.valueOf(30));
		aMap.put("D",Integer.valueOf(10));
		System.out.println(aMap);
		//동일한 키값을 넣으면 값이 바뀐다.
		aMap.put("A",Integer.valueOf(20)); 	
		System.out.println(aMap);
		
		//데이터검색
		Integer i1 =aMap.get("A");
		System.out.println(i1);
		//특정 키가 있는지 확인
		System.out.println(aMap.containsKey("B"));
		//특정값있는지확인
		System.out.println(aMap.containsValue(Integer.valueOf(60)));
		System.out.println(aMap.size());// 길이
		System.out.println(aMap.keySet());//모든 키 반환
		System.out.println(aMap.values());//모든 값 반환
		
		//키와 값의 쌍을 반환
		System.out.println(aMap.entrySet());
		for(Entry <String, Integer> e : aMap.entrySet()) {
			System.out.println(e.getKey() +" "+ e.getValue());
		}
		
		//데이터삭제
		aMap.remove("A");
		System.out.println(aMap);
		
		
	}

}
