package Chapter15_inherit_figure;

public class Triangle extends Figure {

	public Triangle(int height, int width) {
		super(height, width);
	}

	@Override
	public void area() {
		double area=(1/2.0)*this.getHeight()*this.getWidth();
		//or    1 /(double)2 로해도됨. 
		System.out.println(area);
	}
	
	

}
