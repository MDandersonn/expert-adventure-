package Chapter24_SubStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Subject implements Serializable{
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
	
}

public class ObjectTypeClass {

	public static void main(String[] args) {
		File f= new File("D:\\sample4.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
			Subject s1 =new Subject("국어",60);
			Subject s2 =new Subject("수학",40);
			Subject s3 =new Subject("영어",50);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
			Subject s1 = (Subject)ois.readObject();
			Subject s2 = (Subject)ois.readObject();
			Subject s3 = (Subject)ois.readObject();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
