// Question 2.
public class SavingsAccount {

	// Question 3.
	// Properties of the class...
	private int balance;

	// Question 4.
	// Constructors of the class...
	public SavingsAccount() {
		balance = 0;
	}

	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}

	// Methods of the class...

	// Question 5.
	public void greet() {
		System.out.println("Welcome!");
		System.out.println();
	}

	// Question 6.
	public void showBalance() {
		System.out.println("Your current balance: " + balance);
	}

	// Question 7 + 8.
	public void deposit(int howMuch) {
		if (howMuch < 0) {
			System.out.println("Error: the amount given is negative.");
		}
		else {
			balance = balance + howMuch;
		}
	}

	public void withdraw(int howMuch) {
		if (howMuch < 0) {
			System.out.println("Error: the amount given is negative.");
		}
		else {
			balance = balance - howMuch;
		}
	}

	// Question 10.
	// The 'transfer' method is not described in the javadoc (?).
}