package Demo;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("NUmber is even");
			
		} else {
			System.out.println("Number is odd");

		}
	

	}

}
