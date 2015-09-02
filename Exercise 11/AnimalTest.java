class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      // Question 1b.
      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly(); The 'fly'method is declared in the subclass 'Bird'.

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills); The property 'numberOfKills' is declared in the subclass 'Eagle'. 
      b.talk();
      //b.attack(); The method 'attack' is declared in the subclass 'Eagle'. 

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills); The property 'numberOfKills' has private access in the class 'Eagle'.
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

      // Question 1c.
      // Output:
      /*
      4
      false
      Hello
      2
      true
      true
      Hello
      2
      true
      Hello
      */

      // Question 1d.
      // The number printed out for e.numberOfLegs is equal to 2, because this
      // property is inherited from the 'Bird' class, which in turn inherits
      // the property from the 'Animal' class. The value (2) is set in the
      // 'Bird' class.

      // Question 1e (?).
      a = b;
      a.talk(); 
      //a.fly(); This line gives a compiler error. The variable 'a' is of type
      // 'Animal'. The 'fly' method is declared in the subclass 'Bird' (?).

      // Question 1f (?).
      //b = a; This line gives a compiler error.
      b.talk();
      b.fly();
   }

}
