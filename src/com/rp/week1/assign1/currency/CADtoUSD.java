package com.rp.week1.assign1.currency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CADtoUSD {
	
	private Scanner sc;
	
	public CADtoUSD(Scanner sc) {
		this.sc = sc;
	}
	
	public double convertCADtoUSD() {
		
		double conversion = 0;
		
		while(true) {
			try {
				System.out.println("Enter CAD Amount => ");
				double cadAmount = sc.nextDouble();
				
				System.out.println("Enter exchange Rate from CAD to USD => ");
				double exchangeRate = sc.nextDouble();
				
				conversion = cadAmount * exchangeRate;
				
				sc.nextLine();
				break;
			} catch (InputMismatchException e) {
			   System.out.println("please enter valid amount or Exchange Rate");
			   sc.next();
			}
		}
		
		return conversion;
	}

}
