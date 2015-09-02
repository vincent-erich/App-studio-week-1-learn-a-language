public class LoopTest {
   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      LoopTest me = new LoopTest();
      me.doStuff();
   }
   // add your code here...
   public void doStuff() {
      // Question 2.
      System.out.println("2^1 using powerOf2A: " + powerOf2A(1));
      System.out.println("2^2 using powerOf2A: " + powerOf2A(2));
      System.out.println("2^3 using powerOf2B: " + powerOf2B(3));
      System.out.println("2^4 using powerOf2B: " + powerOf2B(4));
      System.out.println("2^5 using powerOf2C: " + powerOf2C(5));
      System.out.println("2^6 using powerOf2C: " + powerOf2C(6));
      System.out.println();

      // Question 3.
      System.out.println("2^0 using powerOf2A: " + powerOf2A(0));
      System.out.println("2^0 using powerOf2B: " + powerOf2B(0));
      System.out.println("2^0 using powerOf2C: " + powerOf2C(0));
      System.out.println();

      // Question 4.
      System.out.print("Print a line of five stars using printLineC: ");
      printLineC(5);
      System.out.print("Print a line of three stars using printLineA: ");
      printLineA(3);
      System.out.print("Print a line of seven stars using printLineB: ");
      printLineB(7);
      System.out.print("Print a line of zero stars using printLineC: ");
      printLineC(0);
      System.out.print("Print a line of zero stars using printLineA: ");
      printLineA(0);
      System.out.print("Print a line of zero stars using printLineB: ");
      printLineB(0);
   }
   // These functions compute powers of two.
   public int powerOf2A(int n) {
      int counter = n;
      int result  = 1;
      while (counter != 0) {
         result = 2 * result;
         counter--;
      }
      return result;
   }
   public int powerOf2B(int n) {
      // Question 3.
      if (n == 0) {
         return 1;
      }
      int counter = n;
      int result  = 1;
      do {
         result = 2 * result;
         counter--;
      } while (counter != 0);
      return result;
   }
   public int powerOf2C(int n) {
      int counter;
      int result;
      for (counter = n, result = 1; counter != 0; counter--) {
         result = 2 * result;
      }
      return result;
   }
   /**
     *  Prints a row of stars of a given length.
     */
   public void printLineC(int length) {
      for (int i=0; i<length; i++) {
         System.out.print("#");
      }
      System.out.println();
   }
   public void printLineA(int length) {
      int counter = 0;
      while (counter < length) {
         System.out.print("#");
         counter++;
      }
      System.out.println();
   }
   public void printLineB(int length) {
      int counter = 0;
      if (length > 0) { 
         do {
            System.out.print("#");
            counter++;
         } while (counter < length);
      }
      System.out.println();
   }
   
}
