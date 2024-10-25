class MultiCatch {
     public static void main(String args[]) {
         try {
             int a = args.length;
             System.out.println("Number of arguments = " + a);
             int b = 42 / a; // Could generate Divide by Zero exception
 
             int[] c = {1}; // array initialized with size 1
             c[42] = 99; // Generate Array Out Of Bounds exception
 
         } catch (ArithmeticException e) {
             System.out.println("Divide by zero exception.");
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Array index is out of bounds.");
         } catch (RuntimeException e) {
             System.out.println("Runtime exception occurred.");
         }
     }
 }
 