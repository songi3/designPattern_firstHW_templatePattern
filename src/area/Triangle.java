package area;

public class Triangle extends Shape {

	private double w;
	private double h;

	public Triangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {

		return w*h*1/2;
	}
}
