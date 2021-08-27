package co.bridgelabz.JUnitTesting;

import java.util.Scanner;
public class JUnitTesting 
{
	public static void main(String[] args) 
	{
		double p, r, payement;
		int t;
		Scanner sc = new Scanner(System.in); 
	   	System.out.println("Enter Principal: ");
	   	p = sc.nextDouble(); 
	   	System.out.println("Enter Rate of Interest: ");
	   	r = sc.nextDouble(); 
	   	r = (r / 100) / 12; 
	   	System.out.println("Enter Time period in years: ");
	   	t = sc.nextInt();
	   	t = t * 12; 
	   	payement= (p * r) / (1 - Math.pow(1 + r, -t));
	   	System.out.println("Payment: " + payement);   
	 }
	}