package tests;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Pls enter Number");;
		int temp = s.nextInt();
		
//		int a = 153;
		int r,q,sum = 0;
		int n = temp;
		while(n>0){
			r = n%10;
			sum = sum + (r* r* r);
//			System.out.println("Sum"+sum);
			n = n/10;
		}
		
		
		if(sum==temp)
			System.out.println("Armstrong Number -- >"+ temp);
		else
			System.out.println("NOT A Armstrong Number -- >"+ temp);
	
		s.close();
	}

}
