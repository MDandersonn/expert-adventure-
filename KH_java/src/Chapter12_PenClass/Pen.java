package Chapter12_PenClass;

public class Pen {
	private String color;
	private int ballSize;
	private String inkType;
	private boolean simOut;
	
	public Pen(String color, int ballSize, String inkType) {
		super();
		this.color = color;
		this.ballSize = ballSize;
		this.inkType = inkType;
	}
	
	
	public Pen() {
		super();
	}


	public void simChange(String color,String inkType) {
		this.color=color;
		this.inkType=inkType;
		System.out.println("심 변경");
	}
	public void simOut() {
		System.out.println("심 나와서 글을 쓸수가 있습니다.");
		this.simOut=true;
	}
	public void simIn() {
		System.out.println("심 들어가서 글을 쓸수가 없습니다.");
		this.simOut=false;
	}
	public void write(String message) {
		if(simOut) {
			System.out.printf("%s 색상으로 다음의 글을 작성합니다",this.color);
			System.out.println("\t"+message);
		}else {
			System.out.println("글을 작성하려면 펜 심이 나오게하세요");
		}
	}
	public String getColor() {
		return color;
	}
	public int getBallSize() {
		return ballSize;
	}
	public String getInkType() {
		return inkType;
	}
	

}
