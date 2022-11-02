package Chapter26_StudentEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		HashMap<Student,ArrayList<Subject>> hm1 = new HashMap<>();
	
			ArrayList<Subject> arr1 = new ArrayList<>();
			arr1.add(new Subject("국어",100));
			arr1.add(new Subject("영어",80));
			arr1.add(new Subject("일어",60));
			hm1.put(new Student("홍길동",3,3,1), arr1);
			ArrayList<Subject> arr2 = new ArrayList<>();
			arr2.add(new Subject("국어",40));
			arr2.add(new Subject("영어",50));
			arr2.add(new Subject("일어",60));
			hm1.put(new Student("김철수",1,2,1), arr2);
			ArrayList<Subject> arr3 = new ArrayList<>();
			arr3.add(new Subject("국어",70));
			arr3.add(new Subject("영어",80));
			arr3.add(new Subject("일어",90));
			hm1.put(new Student("박종권",2,1,1), arr3);
			
			
		
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\학생성적관리정보.txt"))) {
				for(Entry<Student, ArrayList<Subject>> a : hm1.entrySet()) {
					bw.write(a.getKey().toString()+a.getValue().toString().substring(1,a.getValue().toString().length()-1)+"\r\n");	
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try(BufferedReader br = new BufferedReader(new FileReader("D:\\학생성적관리정보.txt"))){
				while(true) {
					String s= br.readLine();
					if (s==null)break;
					System.out.println(s);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
	}

}
