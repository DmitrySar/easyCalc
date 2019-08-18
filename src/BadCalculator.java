import java.util.Scanner;

public class BadCalculator {
    // Как не надо делать!!!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        if (scanner.hasNextLine()) {
            string = scanner.nextLine();
        }
        assert string != null;
        String[] arrayStr = string.split(" ");
        double a = Double.parseDouble(arrayStr[0]);
        String operation = arrayStr[1];
        double b = Double.parseDouble(arrayStr[2]);
        if (operation.equals("+")) {
            System.out.println(a+b);
        }
        if (operation.equals("-")) {
            System.out.println(a-b);
        }
        if (operation.equals("*")) {
            System.out.println(a*b);
        }
        if (operation.equals("/")) {
            System.out.println(a/b);
        }
    }
}
