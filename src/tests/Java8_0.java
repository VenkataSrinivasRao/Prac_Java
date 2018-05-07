package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8_0 {

	public static void main(String[] args) {
		
//		List<String> l = Arrays.asList("JAN","","MAR","","MAY","","JULY")	;	
	
		List<Integer> l = Arrays.asList(1,2,3,4,5,6)	;
		
//		l.stream().filter(f -> (!(f.equals(""))&& !(f.equals("JAN")))).collect(Collectors.toList()).forEach(System.out::print);
		
		l.forEach(i -> System.out.println(i));
		
//		l.forEach(System.out::println);//Method Reference
		
//		l.forEach(i -> doubleit(i));
		
		l.forEach(Java8_0::doubleit);    //Method Reference
	
	}
	
	public static void doubleit(int i){
		System.out.println(i*2);
	}

}
