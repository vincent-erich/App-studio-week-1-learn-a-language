class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }

   // Question 6.
   public Citizen(String name) {
      this.name = name; // Use 'this' keyword since constructor parameter and property have the same name ('name').
      // The other properties are automatically set to zero.  
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }

   public void setSalary(int aSalary) {
      salary = aSalary;
   }

   // Question 2.
   public void salaryRise(int amount) {
      salary = salary + amount;
   }

   // Question 3.
   public int netWorth() {
      return savings - loan;
   }

   // Question 5.
   public String toString() {
      String information = "Name: " + name + ", Salary: " + salary + ", Savings: " + savings;

      // Only include 'loan' if the person has one.
      if (loan > 0) {
         information = information + ", Loan: " + loan;
      } 

      return information;
   }

}

class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);

      System.out.println("Ernie's salary is: " + e.getSalary());

      // Question 2.
      e.salaryRise(10000);
      System.out.println("Ernie's salary after raise is: " + e.getSalary());

      // Question 3.
      System.out.println("Ernie's net worth is: " + e.netWorth());

      // Question 4.
      // ?

      // Question 5.
      System.out.println(e.toString());
      System.out.println(b.toString());

      // Question 6.
      Citizen f = new Citizen("Fred");
      System.out.println(f.toString());

   }
}
