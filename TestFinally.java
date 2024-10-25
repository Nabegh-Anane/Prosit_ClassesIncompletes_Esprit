import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Enter your code:");
            int x = System.in.read();
            System.out.println("You entered: " + x);
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        } finally {
            System.out.println("Thank you for your visit.");
        }
    }
}
