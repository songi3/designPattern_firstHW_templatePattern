package area;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaProductCalculator extends AreaCalculator {

	public void setAreasum() {
		this.areasum = 1.0;
	}

	public void areasumCalculate(Shape curShape){
		this.areasum *= curShape.area();
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