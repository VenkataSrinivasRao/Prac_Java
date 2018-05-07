package tests;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int p = s.nextInt();
		boolean isPrime = true;
		int t = p;
		for (int i = 2; i < t/2; i++) {
			if(t%i==0)
			{
				isPrime = false;
				System.out.println("Not a Prime Divisible by "+i);
				break;
			}
			
		}
		
		if(isPrime){
			System.out.println(p + "  Is a Prime");
		}
		else {
			System.out.println(p + "  Is not a Prime");
		}
		

	}

}
