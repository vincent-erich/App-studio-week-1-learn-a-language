class Person {

	// Properties of the class...
	private String name;
	//private int age;
	public int age; // Question 7. Change the definition of 'age' to 'public' to call the property from another class.
	private String eyeColour; // Question 2.

	// Constructor of the class... 
	public Person(String aName, int anAge, String anEyeColour) {
		name = aName;
		age = anAge;
		eyeColour = anEyeColour; // Question 2.
	}

	// Methods of the class...
	public void talk() {
		System.out.println("Hi, my name's " + name + ",");
		System.out.println("my age is " + age);
		System.out.println("and the colour of my eyes is " + eyeColour); // Question 2.
		System.out.println();
		commentAboutAge(); // Question 8.
	}

	public void commentAboutAge() {
		if (age < 5) {
			System.out.println("baby");
		}
		if (age == 5) {
			System.out.println("time to start school");
		}
		// Question 3.
		if (age > 60) {
			System.out.println("old person");
		}
	}

	// Question 5.
	public void growOlder() {
		age = age + 1;
	}

	// Question 6.
	public void giveKnighthood() {
		name = "Sir " + name; 
	}

	// Question 9.
	public void growOlderBy(int years) {
		age = age + years;
	}

}