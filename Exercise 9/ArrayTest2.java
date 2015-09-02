class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void doStuff() {

      // insert your code here:
      // Question 2b.
      Human[] threesome = new Human[3];

      // Question 2c.
      Human angus = new Human("Angus");
      Human brian = new Human("Brian");
      Human charles = new Human("Charles");

      threesome[0] = angus;
      threesome[1] = brian;
      threesome[2] = charles;

      // Question 2d.
      System.out.println("Question 2d (print out the three Human objects using each object's toString method):");
      for (int i=0; i<3;i++) {
         System.out.println(threesome[i].toString());
      }

      // Question 2f.
      System.out.println();
      System.out.println("Question 2f (call the printArray method):");
      printArray(threesome);
   }

   // Question 2e.
   public void printArray(Human[] x) {
      for (int i=0; i<x.length; i++) {
         System.out.println(x[i].toString());
      }
   }

}
