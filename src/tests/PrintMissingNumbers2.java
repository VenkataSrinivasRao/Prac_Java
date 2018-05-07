package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintMissingNumbers2 {

	public static void main(String[] args) {


		List<Integer> al = new ArrayList<Integer>();
		int a[] = {2,3,5,1,10};
		//		char a1[]= {'a','b','d','e'};

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			s.add(a[i]);
		}

		System.out.println(s.toString());

		for(int j=1;j<=s.size();j++){
			if(s.add(j)){
				System.out.println(j);
				al.add(j);
			}
		}

		System.out.println(al.toString());
	}

}
