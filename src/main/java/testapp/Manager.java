package testapp;

public class Manager extends Employee {
	private String teamName;

	public Manager(String firstName, String lastName, String residentialAddrees, String workAddress,
			String employeeNumber, String teamName) {
		super(firstName, lastName, residentialAddrees, workAddress, employeeNumber);
		this.teamName = teamName;
	}
	
	@Override
	public void displayDetails(){
		System.out.println("Team Name is " + this.teamName);
		super.displayDetails();
	}
}
