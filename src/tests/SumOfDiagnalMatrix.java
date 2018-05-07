package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfDiagnalMatrix {

	public static void main(String[] args) {
		
		int s[]= {10,12,33,4,15};
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		List<Integer> alist = new ArrayList<Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);list.add(12);list.add(52);list.add(2);
		List  unmod = Collections.unmodifiableList(list);
		//unmod.add(999);
		
		
		Integer s1[] = new Integer[list.size()];
		list.toArray(s1);
		System.out.println(Arrays.toString(s1));
		
		
		
		
		/*int a[][]={{1,2,3},
				   {1,0,3},
				   {4,2,3}
				   };
		
		int lTr = 0,rTl = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j){
					lTr = lTr + a[i][j];
				}
				if(i+j==2){
					rTl = rTl + a[i][j];
				}
			}
			
		}
		
		System.out.println("lTr  "+lTr);
		System.out.println("rTl  "+rTl);*/

	}

}
