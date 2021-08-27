package co.bridgelabz.JUnitTesting;

import java.util.Scanner;
public class JUnitTesting 
{
	public static double squareRoot(double c, double l){
        double t = c;
        double root;                 
        int count = 0;
       while (true)
        {
            count++;
            root = 0.5 * (t + (c / t));
            if (Math.abs(root - t) < l)
                break;
            t = root;
        }
      return root;
}
	public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
        double c;
        double l = 0.00001;
        System.out.println("Enter the number:");
        c=sc.nextDouble();
     
        System.out.println(squareRoot(c, l));
    }
}