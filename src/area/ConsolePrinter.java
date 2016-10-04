package area;

public class ConsolePrinter {

	private AreaCalculator ac;

	public void setAreaCalculator(AreaCalculator ac) {
		this.ac = ac;
	}

	public void print() {
		this.ac.calcPrint();
		System.out.println(ac.getAreasum());
	}
}
