class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:
      // Question 1b.
      double[] nums = new double[10];

      // Question 1c.
      int index;
      double value;
      for (index=0, value=1.0; index<10; index++) {
         nums[index] = value;
         value = value + 0.1; 
      }

      // Question 1d.
      System.out.println();
      System.out.println("Question 1d (verify that the values are what they are supposed to be):");
      for (int i=0; i<10; i++) {
         System.out.println(nums[i]);
      }

      // Question 1e.
      System.out.println();
      System.out.println("Question 1e (call to printArray in ArrayPrint.class):");
      ArrayPrint.printArray(nums);

      // Question 1g.
      System.out.println();
      System.out.println("Question 1f (verify that own implementation of printArray produces the correct output):");
      printArray(nums);
   }

   // Question 1f.
   public void printArray(double[] x) {
      for (int i=0; i<x.length; i++) {
         System.out.println(x[i]);
      }
   }
}
