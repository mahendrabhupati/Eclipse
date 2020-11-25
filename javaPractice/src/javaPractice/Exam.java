package javaPractice;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		int a = 899, rem = 0, rev = 0;
		// Scanner sc= new Scanner(System.in);
		// a= sc.nextInt();
		// b=sc.nextInt();

		while (a!= 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);

	}
}
