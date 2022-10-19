package Chapter13_StudentManagement;

import java.util.Arrays;

public class Student {
	Subject[] sbArray= new Subject[0];
	String name;
	int year;
	
	public void addSubject(String name,int score) {
		sbArray= Arrays.copyOf(sbArray, sbArray.length+1);
		sbArray[sbArray.length-1]=new Subject(name,score);
		System.out.println(name+"과목이 추가되었습니다");
		
	}
	public void modifyScore(String name,int score) {
		for(int i=0;i<sbArray.length;i++) {
			if(sbArray[i].subjectName.equals(name)) {
				sbArray[i].score=score;
				System.out.println(score+" 로 수정되었습니다.");
				break;
			}
		}
		
		
	}
	public void removeSubject(String name) {
		boolean sw=false;
		for(int i=0 , j=0;i<sbArray.length;i++) {
			if(sbArray[i].subjectName.equals(name)) {
				sw=true;//찾는게있다.
			}
		}
		
		if(sw==true) {
			Subject[] tmp =new Subject[sbArray.length-1];
			for(int i=0 , j=0;i<sbArray.length;i++) {
				if(sbArray[i].subjectName.equals(name)) {
					System.out.println("삭제되었습니다.");

				}else {
					tmp[j]=sbArray[i];
					j++;
				}
			}
			sbArray=tmp;
			
		}else {
			System.out.println("찾는 과목이 없습니다.");
		}
		
	}
	
	public void showAll() {
		
		for(int i=0;i<sbArray.length;i++) {
			String result = String.format("%s : %d  %s",this.sbArray[i].subjectName, this.sbArray[i].score, this.sbArray[i].grade);
			System.out.println(result);
			
		}
	}
	

}
