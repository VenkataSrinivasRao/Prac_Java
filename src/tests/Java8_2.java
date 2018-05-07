package tests;

import java.util.Arrays;
import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class Java8_2 {

	public static void main(String[] args) {

		/**
		 * filter reduce predicate Interface test method
		 */
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result = 0;
		
		for (int i : values) {
			if(i%5==0)
			{
//				result = result + i;
				result += i;
			}
		}
		
		System.out.println(result);
		System.out.println(values.stream()
								 .filter(i -> i%5==0)
								 .map(i -> i*2)
								 .reduce(0,Integer::sum));
//								 .reduce(0,(c,e) -> c+e));
	}

	
}
