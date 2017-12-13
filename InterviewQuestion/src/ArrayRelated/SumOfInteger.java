package ArrayRelated;

import java.util.Scanner;

public class SumOfInteger
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int sum =0;
		while (number>0) {
			int remainder = number%10;
			sum = sum +remainder;
			number = number/10;
		}
		System.out.println("Sum of your Number : "+sum);
	}
}
