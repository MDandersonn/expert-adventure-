package Chapter25_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;


class Score{
	private double score;
	private String grade;
	
	public Score(double score) {
		super();
		setScore(score);

	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		int score1= (int)score;
		this.score = score;
		switch(score1){
		case 90 :
			this.grade = "A"; break;
		case 80 :
			this.grade = "B"; break;
		case 70 :
			this.grade = "C"; break;
		case 60 :
			this.grade = "C"; break;
		default:
			this.grade = "F"; break;
	
		
		}
	}
	public String getGrade() {
		return grade;
	}
	
	
}

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String,Score> h1 = new HashMap<>();
	
		h1.put("국어", new Score(10.0) );
		h1.put("수학",new Score(20.0));
		h1.put("영어",new Score(30.0));
		h1.put("과학",new Score(40.0));
		h1.put("사회",new Score(50.0));
		h1.put("체육", new Score(60.0));
		h1.put("미술", new Score(70.0));
		ArrayList<HashMap<String,Score>> arr = new ArrayList<>();
		arr.add(h1);
		

		
		
		Random rand = new Random();
		int i=0;
		
		while(i<4) {
			HashMap<String, Score> datas = new HashMap<String, Score>();
			for(String subject: h1.keySet()) {
				double score = Double.valueOf(rand.nextInt(40) * rand.nextDouble() + 60);
				datas.put(subject, new Score(score));
				
			}
			for(String s : datas.keySet()) {
				System.out.print(s+i);
				System.out.println();
				System.out.print(datas.get(s).getScore());
				System.out.println();
			}
			System.out.println();
			arr.add(datas);
			
			i++;
			System.out.println(arr.get(i-1).get("미술").getScore());
			System.out.println("해시코드: "+ datas.hashCode());
//			datas.clear();

		}
//		datas.put("안녕", new Score(100));
		
		System.out.println(3.4+60);
		int sum=0;
		for(int j=0;j <arr.size() ; j++) {
			for( Score a : arr.get(j).values() ) {
				sum += a.getScore();
			}
			System.out.println("총점 :"+sum +"  평균 : "+ sum/arr.get(j).size());
			sum=0;
			
		}
	}

}
