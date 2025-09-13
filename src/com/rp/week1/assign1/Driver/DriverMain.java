package com.rp.week1.assign1.Driver;

import java.util.Scanner;

import com.rp.week1.assign1.currency.CADtoUSD;
import com.rp.week1.assign1.distance.MilesToKilometers;
import com.rp.week1.assign1.grades.GradeCalculator;
import com.rp.week1.assign1.volume.LitersToGallons;

public class DriverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Task a
		GradeCalculator gradeCalculator = new GradeCalculator(sc);
		System.out.println(gradeCalculator.GradeCalc());
		
		// Task b
		MilesToKilometers mileToKm = new MilesToKilometers(sc);
		System.out.println(mileToKm.convertMilesToKms());
		
		// Task c
		LitersToGallons literToGallon = new LitersToGallons(sc);
		System.out.println(literToGallon.convertLitersToGallons());
		
		// Task d
		CADtoUSD cadtoUSD = new CADtoUSD(sc);
		System.out.println(cadtoUSD.convertCADtoUSD());
		
		
		sc.close();
		
	}

}
