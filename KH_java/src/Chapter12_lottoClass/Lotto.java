package Chapter12_lottoClass;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int seq;
	private int[] lottoNum;
	private int bonus;
	
	
	public Lotto(int seq) {
		super();
		this.seq = seq;
		
		
	}
	public void makeNum() {
		//번호중복X 번호확인은 문자열로반환
		Random rand =new Random();
		this.lottoNum = new int[7];
		boolean sw=true;
		for(int i=0; i<7;) {
			int num=rand.nextInt(46)+1; //0~45 >1~46
			for(int j=0; j<i;j++) {
				if(lottoNum[j]==num) {
					sw=false;
					break;
				}
			}
			if(sw==true) {
				lottoNum[i]=num;
				i++;
			}
		}
		this.bonus=lottoNum[6];
		lottoNum= Arrays.copyOf(lottoNum, 6);
		System.out.println("로또번호가생성되었습니다");
	}
	public void checkNum() {
		String r=Arrays.toString(lottoNum);
		System.out.println("로또번호를 체크합니다.");
		System.out.println(r);
		System.out.println("보너스번호는 : " + this.bonus);
	}
}
