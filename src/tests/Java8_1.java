package tests;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_1 {

	public static void main(String[] args) {
		
		/**
		 * Sum Method of Integer Class for reduce
		 * 
		 */
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		/*int result = 0;
		
		for (int i : values) {
			
			result = result + i*2;
			
		}
		
		System.out.println(result);*/
		
//		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c, e)));
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
		
		values.stream().map(i -> i*2).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
