package Chapter20_StringClass;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		sb.append("문자열");
		System.out.println(sb.toString());
		sb.append("append");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
		sb.delete(0, 4);
		System.out.println(sb.toString());
		sb.insert(4,"OO");
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		sb.setLength(30);//뒤에공백이추가됨
		System.out.println(sb.toString());
		
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}


}
