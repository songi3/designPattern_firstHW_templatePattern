package area;

import java.util.ArrayList;

public abstract class AreaCalculator {
	public abstract void calculate();

	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areasum;

	public abstract void setAreasum();
	public abstract void areasumCalculate(Shape curShape);
	
	public double getAreasum() {
		return areasum;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

}
