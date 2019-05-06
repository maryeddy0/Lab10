
public class Validator {
	
	private double radius;
	private double circ;
	private double area;
	
	
	public Validator() {
		double rad = 0;
		radius = rad;
	}

	public void setCirc(double rad) {
		circ = 2*(rad * 3.14);
	}
	//getters usually return the same type as the assciated instance variable
	public double getCirc(double rad) {
		circ = 2*(rad * 3.14);
		return circ;
	}
	
	public void setArea(double rad) {
		area = ((rad * rad) * 3.14);
	}
	//getters usually return the same type as the assciated instance variable
	public double getArea(double rad) {
		area = ((rad * rad) * 3.14);
		return area;
	}
	}

	

	


