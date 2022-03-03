package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Inidivisual or company? (i/c)");
			char option = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			if (option == 'i') {
				System.out.print("Health Expenditures");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees");
				int numberOfEmployees = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("TAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.println(tp);
		}
		
		sc.close();
		
	}

}
