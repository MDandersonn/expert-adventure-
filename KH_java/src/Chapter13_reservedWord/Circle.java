package Chapter13_reservedWord;

public class Circle {
	private static final double PI=3.14;//final static해도 상관없다.
	private double radius;//반지름
	private double area;//면적
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
		this.area = radius*radius* Circle.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPI() {
		return PI;
	}

	public static void main(String[] args) {
		Circle c1= new Circle(10);
		Circle c2= new Circle(20);
		Circle c3= new Circle(30);
		

	}

}
