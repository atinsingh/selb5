package testapp;

public class Employee extends Person {

	private String workAddress;
	private String employeeNumber;
	
	
	
	public Employee(String firstName, String lastName, String residentialAddrees, String workAddress,
			String employeeNumber) {
		super(firstName, lastName, residentialAddrees);
		this.workAddress = workAddress;
		this.employeeNumber = employeeNumber;
	}



	@Override
	public void displayDetails() {
		System.out.println("Work Address is = "+ this.workAddress);
		System.out.println("Employee Number is = "+ this.employeeNumber);
		super.displayDetails();
	}
	
	
//	public void displayDetails(){
//		System.out.println("Name is = " + this.firstName + " "+ this.lastName);
//	}
}
