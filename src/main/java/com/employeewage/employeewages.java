package com.employeewage;

/**
 * Hello world!
 *
 */
public class employeewages

{
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	private final String company;
	private final int empRateperHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalWage;

	public employeewages(String company, int empRateperHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRateperHour = empRateperHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}

	public void computeWage() {

		int empHrs = 0;
		int totalHrs = 0;

		int totalWorkingDays = 0;

		while (totalHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalHrs += empHrs;
			System.out.println("Days: " + totalWorkingDays + " Emp hr:" + empHrs);
		}
		totalWage = totalHrs * empRateperHour;
	}

	public String toString() {

		return "Total Emp Wage for company " + company + " is :" + totalWage;
	}

	public static void main(String[] args) {
		employeewages dMart = new employeewages("DMArt", 20, 2, 10);
		employeewages reliance = new employeewages("Reliance", 10, 4, 20);
		dMart.computeWage();
		System.out.println(dMart);
		reliance.computeWage();
		System.out.println(reliance);
	}
}