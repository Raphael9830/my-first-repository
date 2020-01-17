package org.amalitech.classtest_01;

import java.util.Scanner;

public class ClassTest_0001 {
	
	
	public static void main(String[] args) {
		
		System.out.println("************************************************************************");
		System.out.println("			HI ANGELLA, YOU ARE WELCOME!");
		System.out.println("************************************************************************");                                                              
		
		expenseCalculator();  //Method Call
		
		
	}
	//This method first accepts Angealla's inputs (expenses),
	//Then calculates 5% off every input as savings
	//And finally displays her total expenses and savings in GH
	
	public static void expenseCalculator() {
		
		Scanner input = new Scanner(System.in);
		double savings1, savings;
		double total_expense = 0.0;
		double total_savings = 0.0;
		
		System.out.println("Enter your first expense:");
		double expense1 = input.nextDouble();
		System.out.println("You entered: GH " + expense1);
		savings1 = 0.05 * expense1;
		System.out.println("You should have saved: GH " + savings1);
		
		total_expense = expense1;
		total_savings = savings1; 
		
		
		for (int x = 1; x < 10; x++) {
			System.out.println("Enter your next expense:");
			
			double expense = input.nextDouble();
			System.out.println("You entered: GH " + expense);
			
			savings = 0.05 * expense;
			System.out.println("You should have saved: GH " + savings);
			
			total_expense = total_expense + expense;
			
			total_savings = total_savings + savings; 
			
		}
		
		System.out.println("\nDear Angella,");
		System.out.printf("Your Total Expenses : GH %.2f", total_expense );
		System.out.printf("\nAmount In Savings : GH %.2f", total_savings);
			
	}

}
