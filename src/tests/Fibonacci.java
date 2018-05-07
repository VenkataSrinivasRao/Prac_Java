package tests;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the count of Fibonacci Series");
		
		int count = s.nextInt();
		int n1 =0, n2 = 1, n3;
		System.out.print(n1 + "  "+ n2 + "  ");
		
		for (int i = 2; i <count ; i++) {
			System.out.print(( n3 = n1+n2) + "  ");
			
			n1= n2;
			n2 = n3;
			
		}

	}

}
