import java.util.Scanner;

public class BadCalculator {
    // Как не надо делать!!!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        if (scanner.hasNextLine()) {
            string = scanner.nextLine();
        }
        String[] arrayStr = string.split(" ");
        double a = Double.valueOf(arrayStr[0]);
        String znak = arrayStr[1];
        double b = Double.valueOf(arrayStr[2]);
        if (znak.equals("+")) {
            System.out.println(a+b);
        }
        if (znak.equals("-")) {
            System.out.println(a-b);
        }
        if (znak.equals("*")) {
            System.out.println(a*b);
        }
        if (znak.equals("/")) {
            System.out.println(a/b);
        }
    }
}
