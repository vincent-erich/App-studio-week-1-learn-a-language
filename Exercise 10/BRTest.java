public class BRTest {
	
	// Properties of the class...
	// Question 2c + 2d.
	private int calls;
	private int successfulCalls;
	private int totalReturned;
	private int[] exceptCounts = new int[5];

	// Methods of the class...
	// Question 2e.
	public void callIt() {
		int randomValue;
		calls++;
		try {
			randomValue = BadRandom.randVal();
			successfulCalls++;
			totalReturned += randomValue;
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException!");
			exceptCounts[0]++;
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException!");
			exceptCounts[1]++;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!");
			exceptCounts[2]++;
		}
		catch (ClassCastException e) {
			System.out.println("ClassCastException!");
			exceptCounts[3]++;
		}
		catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException!");
			exceptCounts[4]++;
		}
	}

	// Question 2f.
	public void resetCounts() {
		calls = 0;
		successfulCalls = 0;
		totalReturned = 0;
		for (int i=0; i<5; i++) {
			exceptCounts[i] = 0;
		}
	}

	// Question 2g.
	public void nRandInts(int n) {
		while (successfulCalls != n) {
			callIt();
		}
	}

	// Question 2h.
	public void writeData() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Number of calls: " + calls);
		System.out.println("Successful calls: " + successfulCalls);
		System.out.println("Total returned: " + totalReturned);
		System.out.println("Percentage Arithmetic Exceptions: " + (((double)exceptCounts[0] / calls) * 100));
		System.out.println("Percentage Null Pointer Exceptions: " + (((double)exceptCounts[1] / calls) * 100));
		System.out.println("Percentage Array Index Exceptions: " + (((double)exceptCounts[2] / calls) * 100));
		System.out.println("Percentage Class Cast Exceptions: " + (((double)exceptCounts[3] / calls) * 100));
		System.out.println("Percentage Negative Array Exceptions: " + (((double)exceptCounts[4] / calls) * 100));
		System.out.println("Percentage of successful calls: " + (((double)successfulCalls / calls) * 100));
	}

	// Question 2i.
	public static void main(String[] args) {
		BRTest me = new BRTest();
		me.resetCounts();
		me.nRandInts(30);
		me.writeData();
	}

} 