package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		if (anualIncome < 20000.00) {
			return (anualIncome*15.0/100) - (healthExpenditures*50.0/100);
		} else {
			return (anualIncome*25.0/100) - (healthExpenditures*50.0/100);
		}
		
		
	}

}
