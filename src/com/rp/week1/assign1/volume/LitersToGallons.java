package com.rp.week1.assign1.volume;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * @author ravi31186
 * Convert Liters to Gallons as per provided value.
 * This method will keep asking for correct value until user does not enter valid input.
 */

public class LitersToGallons {
	
	private Scanner sc;
	
	public LitersToGallons(Scanner sc) {
		this.sc = sc;
	}
	
	public double convertLitersToGallons() {
		
		double literToGallon = 0;
		
		while(true) {
			try {
				System.out.println("Enter value in Liters => ");
				
				double liters = sc.nextDouble();
				
				literToGallon = liters * 0.264172;
				
				sc.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please Enter Double value to proceed => ");
				sc.next();
			}		
		}
		
		return literToGallon;
		
	}

}
