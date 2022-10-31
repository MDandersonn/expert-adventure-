package Chapter15_inherit_figure;

public class Rectangular extends Figure {

	public Rectangular(int height, int width) {
		super(height, width);
	}

	@Override
	public void area() {
		double area=this.getHeight()*this.getWidth();
		System.out.println(area);
				
		
	}
	

}
