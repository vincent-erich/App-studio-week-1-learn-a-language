class CartoonCharacter {

   // Properties of the class...
   private String name;
   //private String favouriteColour;
   public String favouriteColour; // Question 6.
   private int favouriteNumber;
   public static int count = 0; // Question 7.

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      count = count + 1; // Question 7.
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}
