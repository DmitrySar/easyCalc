public class Main
{
	public static void main(String[] args)
	{
		ReadLine readline = new ReadLine();
		Calculator calculator = new Calculator(readline.getA(), readline.getOperation(), readline.getB());
		System.out.println(calculator.getInstance().getResult());
	}
}
