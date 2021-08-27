package co.bridgelabz.JUnitTesting;

import java.util.Scanner;
import java.time.DayOfWeek;
public class JUnitTesting 
{
	public static void main(String[] args) {
		int m, m0, y, y0, d, d0, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date:");
		d = sc.nextInt();
		System.out.println("Enter Month:");
		m = sc.nextInt();
		System.out.println("Enter Year:");
		y = sc.nextInt();
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y / 100 + y0 /400;
		m0 = m + 12 *((14 - m)/12)-2;
		d0 = (d + x + 31 * m0 / 12) % 7;
		DayOfWeek dayOfWeek = DayOfWeek.of(+d0);
		System.out.println("Day of week - " +dayOfWeek.name());
		System.out.println("Value of " +dayOfWeek.name() + " - " +dayOfWeek.getValue());
		}
		}