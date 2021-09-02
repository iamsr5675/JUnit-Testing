package co.bridgelabz.JUnitTesting;

import java.util.Scanner;

public class JUnitTesting {
	public static int[] toBinary(int n) {

		String x = "";
		while (n != 0) {
			x = (n % 2) + x;
			n /= 2;
		}
		return stringToIntArray(x);
	}

	public static int[] stringToIntArray(String x) {
		int[] b = new int[x.length()];
		for (int i = 0; i < b.length; i++) {
			b[i] = x.charAt(i) - 48;
		}
		return b;
	}

	public static int[] swap(int[] arr)
	{
		int temp, j = arr.length - 3;
		for (int i = 0; i < 3; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}
	
	public static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static int todecimal(int[] b) {
		int dec = 0, j = 0;
		for (int i = b.length - 1; i >= 0; i--) {
			if (b[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();
		int[] b = JUnitTesting.toBinary(n);
		System.out.print("Binary is: ");
		JUnitTesting.showArr(b);

		System.out.print("After Swap: ");
		JUnitTesting.swap(b);
		JUnitTesting.showArr(b);
		System.out.println("Decimal Number: " + JUnitTesting.todecimal(b));
	}
}