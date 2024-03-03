package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		//double xA, xB, xC, yA, yB, yC;
		Triangle x, y;
		x= new Triangle();
		y= new Triangle();
		System.out.println("Entre the measures of triangle X: ");
		//xA = sc.nextDouble();
		//xB = sc.nextDouble();
		//xC = sc.nextDouble();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre the measures of triangle :Y ");
		//yA = sc.nextDouble();
		//yB = sc.nextDouble();
		//yC = sc.nextDouble();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double p = (xA + xB + xC) / 2.0;
		//double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		//double p = (x.a + x.b + x.c) / 2.0;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		double areaX = x.area();
		
		//p = (yA + yB + yC) / 2.0;
		//double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		//p = (y.a + y.b + y.c) / 2.0;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		double areaY = y.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
