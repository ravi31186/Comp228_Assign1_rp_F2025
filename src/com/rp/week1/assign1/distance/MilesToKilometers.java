package com.rp.week1.assign1.distance;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * @author ravi31186
 * Convert Mile to Kilometers as per provided value.
 * This method will keep asking for correct value until user does not enter valid input.
 */

public class MilesToKilometers {
	
	private Scanner sc;
	double conversionInKm = 0;
	
	public MilesToKilometers(Scanner sc) {
		this.sc = sc;
	}
	
	public double convertMilesToKms() {
		
		while(true) {
			try {
				System.out.println("Enter value in Mile => ");
				double mileValue = sc.nextDouble();
				
				conversionInKm = mileValue * 1.60934;
				sc.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please Enter Double value to proceed => ");
				sc.next();
			}

		}		
		return conversionInKm;

		
	}

}
