package question17;

import java.util.Scanner;

public class Interest {
	private Scanner scan = new Scanner(System.in);
	private float rateOfInterest, principal, interest;
	private int years;
	
	public Interest() {
		setRate(0f);
		setPrincipal(0f);
		setYears(0);
		printIntroduction();
	}
	
	public Interest(float rate, float principal, int years) {
		setRate(rate);
		setPrincipal(principal);
		setYears(years);
		printIntroduction();
	}
	
	public void printIntroduction() {
		System.out.println("Simple Interest Calculator");
	}
	
	public void setRate(float rate) {
		this.rateOfInterest = rate;
	}
	
	public void setRate() {
		System.out.print("Please type in your interest rate: ");
		while(true) {
			if(scan.hasNextFloat()) {
				if(scan.nextFloat() >= 0) {
					this.rateOfInterest = scan.nextFloat();
					return;
				}
			}else {
				System.out.print("Must be a valid interest rate, please retype: ");
				scan.next();
			}
		}
	}
	
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	
	public void setPrincipal() {
		System.out.print("Please type in the principal: ");
		while(true) {
			if(scan.hasNextFloat()) {
				if(scan.nextFloat() >= 0) {
					this.principal = scan.nextFloat();
					return;
				}
			}else {
				System.out.print("Must be a valid principal rate, please retype: ");
				scan.next();
			}
		}
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	public void setYears() {
		System.out.print("Please type in the number of years: ");
		
		while(true) {
			if(scan.hasNextInt()) {
				if(scan.nextInt() >= 0) {
					this.years = scan.nextInt();
					return;
				}
			}else {
				System.out.print("Must be a valid amount of years rate, please retype: ");
				scan.next();
			}
		}
	}
	
	
	public float getRate() {
		return this.rateOfInterest;
	}
	
	public float getPrincipal() {
		return this.principal;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public float calculateInterest() {
		this.interest = this.principal * this.rateOfInterest * this.years;
		return this.interest;
	}
	
	public void printParameters() {
		System.out.println("Interest Rate: " + getRate());
		System.out.println("Principal: " + getPrincipal());
		System.out.println("Years: " + getYears());
	}
	
	public void printInterest() {
		System.out.println("Calculate Interest: " + calculateInterest());
	}
}
