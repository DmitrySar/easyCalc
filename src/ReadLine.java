
import java.util.*;

public class ReadLine
 {
	
	private String line;
	private String[] parseLine;
	
	public ReadLine() {
		Scanner in = new Scanner(System.in);
		if (in.hasNextLine()) {
			line = in.nextLine();
			parseLine = line.split(" ");
		}
	}
	
	public double getA() {
		return Double.valueOf(parseLine[0]);
	}
	
	public double getB() {
		return Double.valueOf(parseLine[2]);
	}
	
	public String getOperation() {
		return parseLine[1];
	}
}
