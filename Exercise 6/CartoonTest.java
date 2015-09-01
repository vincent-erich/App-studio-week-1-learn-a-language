class FredFlintstone {

   // Properties of the class...
   static String name            = "Fred Flintstone";
   static String favouriteColour = "blue";
   static int    favouriteNumber = 42;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class WilmaFlintstone {

   // Properties of the class...
   static String name            = "Wilma Flintstone";
   static String favouriteColour = "red";
   static int    favouriteNumber = 63;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class BarneyRubble {

   // Properties of the class...
   static String name            = "Barney Rubble";
   static String favouriteColour = "yellow";
   static int    favouriteNumber = 2;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      /*
      // Question 2.
      FredFlintstone.displayMe();
      System.out.println();

      // Question 3.
      System.out.println("Barney Rubble's favourite colour is " + BarneyRubble.favouriteColour);
      */

      // Question 4.
      CartoonCharacter fredFlintstone = new CartoonCharacter("Fred Flintstone","blue",42);
      CartoonCharacter wilmaFlintstone = new CartoonCharacter("Wilma Flintstone","red",63);
      CartoonCharacter barneyRubble = new CartoonCharacter("Barney Rubble","yellow",2);

      // Question 5.
      fredFlintstone.displayMe();
      System.out.println();
      wilmaFlintstone.displayMe();
      System.out.println();
      barneyRubble.displayMe();
      System.out.println();

      // Question 6.
      System.out.println("Barney Rubble's favourite colour is " + barneyRubble.favouriteColour);
      System.out.println();

      // Question 7.
      System.out.println(CartoonCharacter.count + " cartoon characters have been created");
      System.out.println();
      // 'count' must be a static property, since it is not possible to properly count the
      // number of cartoon characters created if 'count' is an object-specific method.

      // Question 8.
      System.out.println("Pi: " + Math.PI);
   }

}
