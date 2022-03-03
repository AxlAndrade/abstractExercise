package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return (anualIncome * 14.0/100);
		} else {
			return (anualIncome * 16.0/100);
		}
	}

}
