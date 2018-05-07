package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SwapingNumWithoutTempVariable {

	public static void main(String[] args) {
		/*
		 * PalindromeNumber  class lo reverse of Numb and sum of Numb
		 */
		
		int a = 10, b= 20;
		
		System.out.println("Before Swaping--> " + "a : "+a+"   b : "+b);
		
		/*a= a+b;
		b= a-b;
		a= a-b;*/
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		
//		a=(a+b)-(b=a);
		
		System.out.println("After Swaping--> " + "a : "+a+"   b : "+b);
		
		
		 int[] nums = {5,1,4,8,3,2,9,12,11,15};
		 System.out.println(Arrays.toString(nums)); 
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
//		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(nums));
		
		/*List<Integer> list3 = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.reverse(list3);
		System.out.println(list3);*/
		
		
	}

}
