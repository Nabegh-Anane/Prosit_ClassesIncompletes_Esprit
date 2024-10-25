public class AddTable {
    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; ++i) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
