package tests;

import java.util.Arrays;
import java.util.List;

public class Java8_3 {

	public static void main(String[] args) {
		/**
		 * filter reduce predicate Interface test method
		 */
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result = 0;
		
		for (int i : values) {
			if(i%5==0)
			{
				result = i*2;
				break;
			}
		}
		
		System.out.println(result);
		System.out.println(values.stream()
								 .filter(i -> i%5==0)
								 .map(i -> i*2)
								 .findFirst()
								 .orElse(0));
//								 .reduce(0,Integer::sum));
//								 .reduce(0,(c,e) -> c+e));

	}

}
