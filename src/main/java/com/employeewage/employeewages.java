package com.employeewage;

/**
 * Hello world!
 *
 */
public class employeewages

{
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	
	public static int computeWage(String company,int EMP_RATE_HOUR, int NUM_DAYS, int MAX_HRS) {
    
    	
    	int empHrs=0;
    	int totalHrs=0;
    	int totalWage=0;
    	int totalWorkingDays=0;
    	
    	while(totalHrs<=MAX_HRS && totalWorkingDays<NUM_DAYS) {
    		totalWorkingDays++;
    	int empCheck =(int) Math.floor(Math.random() *10)%3;
    	switch(empCheck) {
        case IS_FULL_TIME:
    		empHrs=8;
    		break;
        case IS_PART_TIME:
    		empHrs=4;
    		break;
    	default :
    		empHrs=0;
    		break;
    }
    	totalHrs += empHrs;
    	System.out.println("Days: " +totalWorkingDays+ " Emp hr:" +empHrs);
    } 
    	totalWage=totalHrs*EMP_RATE_HOUR;
	System.out.println("Total Emp Wage for company "+company +" is :" +totalWage);
	return totalWage;}
    public static void main( String[] args )
    {computeWage("DMArt",20,2,10 );
    computeWage("Reliance",10,4,20 );
    	}}