package co.bridgelabz.JUnitTesting;

import java.util.Scanner;
public class JUnitTesting 
{
	public static void main(String[] args) {
		double Celsius, Fahrenheit, c, f;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius:");
		c=sc.nextDouble();
		System.out.println("Enter Fahrenheit:");
		f=sc.nextDouble();
		System.out.println("Press 1 for Celsius to Fahrenheit:");
		System.out.println("Press 2 for Fahrenheit to Celsius:");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			Celsius = (c * 9/5) + 32;
			System.out.println(Celsius);
			break;
		case 2:
			Fahrenheit = (f - 32) * 5 / 9;
			System.out.println(Fahrenheit);
			break;
		}
		}
		}