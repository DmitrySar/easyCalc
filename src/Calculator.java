public class Calculator {
	
	private String operation;
	private double a;
	private double b;
	
	public Calculator(double a, String operation, double b) {
		this.operation = operation;
		this.a = a;
		this.b = b;
	}
	
	public ICalculator getInstance() {
		switch (operation) {
			case "+":
				return new Plus(a, b);
			case "-":
				return new Minus(a, b);
			case "*":
				return new Multiplication(a, b);
			case "/":
				return new Division(a, b);
			default:
				return null;
		}
	}
}
