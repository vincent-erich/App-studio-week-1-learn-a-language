class Flea {
   
   // Properties of the class...
   private String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Question 4.
   public String toString() {
      return "I am a dog called " + name + ", I am " + age + " years old and I have the following flea: " + dogsFlea;
   } 

}

// Question 5.
class DogOwner {

   // Properties of the class...
   private String name;
   private int salary;
   private Dog ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }

   // Question 7.
   public String toString() {
      return "I am a dog owner called " + name + ", I earn " + salary + " dollars p/m, and I own the following dog: " + ownersDog;
   }

}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      // Question 2.
      Flea pop = new Flea("Pop");
      Flea squeak = new Flea("Squeak");
      Flea zip = new Flea("Zip");

      // Question 3.
      Dog rex = new Dog("Rex",3,pop);
      Dog jimbo = new Dog("Jimbo",5,squeak);
      Dog fido = new Dog("Fido",7,zip);

      // Question 4.
      System.out.println(rex.toString());
      System.out.println(jimbo.toString());
      System.out.println(fido.toString());
      System.out.println();

      // Question 6.
      DogOwner angus = new DogOwner("Angus",2000,rex);
      DogOwner brian = new DogOwner("Brian",2500,jimbo);
      DogOwner charles = new DogOwner("Charles",3000,fido);

      // Question 7.
      System.out.println(angus.toString());
      System.out.println(brian.toString());
      System.out.println(charles.toString());
      System.out.println();

      // Question 8.
      // If the reference to the Angus object is called 'a', then the call:
      // a.ownersDog.dogsFlea.toString()
      // results in a compile error since the properties/fields 'ownersDog' and 'dogsFlea' have private access.
      // angus.ownersDog.dogsFlea.toString(); // Check.
   }

}
