package testapp;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String residentialAddrees;
	
	
	
	public Person(String firstName, String lastName, String residentialAddrees) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.residentialAddrees = residentialAddrees;
	}



	public void displayDetails(){
		System.out.println("Name is = " + this.firstName  + " " + this.lastName);
		System.out.println("Address is =  " + this.residentialAddrees );
	}
}
