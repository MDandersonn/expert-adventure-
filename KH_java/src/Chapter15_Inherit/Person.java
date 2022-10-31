package Chapter15_Inherit;

import java.util.Objects;

public class Person {
	public String name;
	private int age;

	public Person(String name) {
		super();
		this.name = name;

	}
	public void addAge() {
		this.age++;
	}
	@Override
	public String toString() {
		return String.format("이름 : %s, 나이:%d",name,age);
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if( name.equals(p.name) && age==p.age ) {
			return true;
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age,name);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
