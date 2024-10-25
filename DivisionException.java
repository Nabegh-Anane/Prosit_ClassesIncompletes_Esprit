import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer:");
            y = scanner.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
