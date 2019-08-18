
import java.util.*;

public class ReadLine
 {

     private String[] parseLine;
	
	public ReadLine() {
		Scanner in = new Scanner(System.in);
		if (in.hasNextLine()) {
            String line = in.nextLine();
			parseLine = line.split(" ");
		}
	}
	
	public double getA() {
		return Double.parseDouble(parseLine[0]);
	}
	
	public double getB() {
		return Double.parseDouble(parseLine[2]);
	}
	
	public String getOperation() {
		return parseLine[1];
	}
}
