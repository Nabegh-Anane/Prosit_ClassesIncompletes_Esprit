import java.io.*;

public class TestExceptions {
    public static void main(String[] args) {
        File inputFile = new File("Sample.jpg");
        File outputFile1 = new File("Output1.jpg");

        try (FileInputStream in1 = new FileInputStream(inputFile);
             FileOutputStream out1 = new FileOutputStream(outputFile1)) {

            int c1;
            while ((c1 = in1.read()) != -1) {
                out1.write(c1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file you have requested cannot be found.");
        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
        }
    }
}
