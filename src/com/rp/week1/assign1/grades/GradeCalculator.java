package com.rp.week1.assign1.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
	
	private Scanner sc;
	
	
	public GradeCalculator(Scanner sc) {
		this.sc = sc;
	}
	
	public char GradeCalc() {
		
		char grade = 'F';
		int numberOfCourse  = 0;
		
		while(true) {
			try {
				System.out.println("How many courses for this semester => ");
				numberOfCourse = sc.nextInt();
				String[] coursesNames = new String[numberOfCourse];
				double[] coursesMarks = new double[numberOfCourse];
				double totalMarks = 0;
				
				for (int i = 0; i <= (numberOfCourse - 1); i++) {
					sc.nextLine();
					
					System.out.println("Please enter Course Name  => ");
					coursesNames[i] = sc.nextLine();
					
					System.out.println("Please enter marks for course " + coursesNames[i] + " =>");
					coursesMarks[i] = sc.nextDouble();
					
					totalMarks += coursesMarks[i];
				}
				
				double average = totalMarks / numberOfCourse;
				
				if (average >= 90) {
					grade = 'A';
				} else if (average >= 80 && average < 90) {
					grade = 'B';
				} else if (average >= 40 && average < 60) {
					grade = 'C';
				} else {
					grade = 'D';
				}
				
				sc.nextLine();
				break;
			} catch(InputMismatchException e) {
				System.out.println("please enter valid input");
				sc.next();
			}
		}
		
		
		return grade;
		
	}
	
	

}
