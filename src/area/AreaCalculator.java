package area;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AreaCalculator {

	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areasum;
	public abstract void setAreasum();
	public abstract void calcPrint();
	
	public abstract void areasumCalculate(Shape curShape);

	public double getAreasum() {
		return areasum;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

	public void calculate() {
		Iterator<Shape> iter = shapes.iterator();

		setAreasum();

		while (iter.hasNext()) {
			Shape curShape = iter.next();
			areasumCalculate(curShape);
		}
	}

}
