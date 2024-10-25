public class SuperHotel {
    static int x[];

    public void reserver() {
        try {
            x[0] = 1;
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized.");
        }
    }

    public static void main(String args[]) {
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}
