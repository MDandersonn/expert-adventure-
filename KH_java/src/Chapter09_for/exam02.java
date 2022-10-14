package Chapter09_for;

public class exam02 {

	public static void main(String[] args) {
		for(int i=1;i<=10; i++) {
			System.out.println("총 10번 반복중"+ i+" 번 반복");
		}
		
		for(int i=0;i<15;i++) {
			System.out.println(3*(i+1));
		}
		
		for(int i=1;7*(i)<150;i++) {
			System.out.println(7*(i)+"반복횟수"+i);			
		}
		
		for(int i=1,x=3; i<=15;i++,x+=3) {
			System.out.printf("%d 번째 반복 -> %d\n",i,x);
		}
		
		for(int i=7,j=0; i<150; i+=7,j++) {
			System.out.printf("%d-> %d번\n",i,j);
		}

	}

}
