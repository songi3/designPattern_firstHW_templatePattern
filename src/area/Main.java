package area;

//SOLID 프린트 p4 
public class Main {
	public static void main(String[] args) {

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(100, 200);

		Circle c1 = new Circle(20);
	
		AreaSumCalculator ac = new AreaSumCalculator();
		ac.addShape(r1);
		ac.addShape(r2);
		ac.addShape(c1);

		ac.calculate();

		ConsolePrinter pr1 = new ConsolePrinter();

		pr1.setAreaCalculator(ac); // 의존성 주입
		pr1.print();

		AreaProductCalculator pc = new AreaProductCalculator();
		pc.addShape(r1);
		pc.addShape(r2);

		pc.calculate();

		pr1.setAreaCalculator(pc); // 의존성 주입
		pr1.print();
	}
}
