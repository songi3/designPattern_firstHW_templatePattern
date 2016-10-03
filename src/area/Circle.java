package area;

public class Circle extends Shape {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {

		return r * r * 3.14;
	}

}
