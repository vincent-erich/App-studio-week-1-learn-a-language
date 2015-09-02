/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;
import java.lang.Integer;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
    

  public void printName () {
    System.out.println("Name: " + name);
  }

  // Question 1b + 1d + 1e.
  public void readAge () throws IOException {
    boolean check = false;
    while (check == false) {
      System.out.print("Input your age: ");
      try {
        age = Integer.parseInt(stdIn.readLine());
        if (age <= 0 || age >= 150) {
          System.out.println("Age must be in the range 0 to 150 (excluding). Please try again.");
        }
        else {
          check = true;
        }
      }
      catch (NumberFormatException e) {
        //System.out.println("Input is alphabetical, age is set to -1.");
        System.out.println("Input is alphabetical, must be numeric. Please try again.");
      }
      catch (IOException e) {
        System.out.println("An error occured while reading the input.");
        System.exit(0);
      }
    }
  }

  // Question 1b.
  public void printAge () {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();

    // Question 1b.
    me.readAge();
    me.printAge();

    // Question 1c.
    // When you type a series of alphabetical characters instead of a number
    // for the age, a 'NumberFormatException' is thrown.
  }

}