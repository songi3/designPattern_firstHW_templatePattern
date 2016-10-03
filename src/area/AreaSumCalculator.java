package area;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaSumCalculator extends AreaCalculator {
	
	public void setAreasum() {
		this.areasum = 0.0;
	}

	public void areasumCalculate(Shape curShape) {
		this.areasum += curShape.area();
	}

}
