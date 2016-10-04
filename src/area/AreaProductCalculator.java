package area;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaProductCalculator extends AreaCalculator {

	public String calcShow() {
		String name = "AreaProductCalculator : ";
		return name;
	}

	public void setAreasum() {
		this.areasum = 1.0;
	}

	public void areasumCalculate(Shape curShape) {
		this.areasum *= curShape.area();
	}

}
