class PersonTest {

	// The main method is the point of entry into the program...

	public static void main(String[] args) {

		// Question 2.
		Person ls = new Person("Luke Skywalker",34,"blue");
		Person wp = new Person("Winston Peters",48,"brown");

		// Question 10.
		//Person ls = new Person();
		//Person wp = new Person();
		// The output shows that the value for the property 'age' is set to 0
		// and that the value for the properties 'name' and 'eyeColour' is set to 'null'.

		ls.talk();
		wp.talk();

		// Question 4 + 8.
		//ls.commentAboutAge();
		//wp.commentAboutAge();

		// Question 5.
		wp.growOlder();
		wp.talk();

		// Question 6.
		wp.giveKnighthood();
		wp.talk();

		// Question 7.
		System.out.println("my age is " + ls.age);
		System.out.println();

		// Question 9.
		ls.growOlderBy(10);
		System.out.println("my age is " + ls.age);
		System.out.println();

	}
}