package testapp;

public class Contractor extends Person {
	private String contractorId;

	public Contractor(String firstName, String lastName, String residentialAddrees, String contractorId) {
		super(firstName, lastName, residentialAddrees);
		this.contractorId = contractorId;
	}
	
	
}
