package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyDisticntElements {

	public static void printDistinctElements(int[] arr){
		
		 for(int i=0;i<arr.length;i++){
//			 boolean isDistinct = false;
			 boolean isDistinct = true;//for printing only unique elements
			 
			      for(int j=0;j<i;j++){
	                if(arr[i] == arr[j]){
//	                    isDistinct = true;
	                	 isDistinct = false;// for printing unique elements
	                    break;
	                 }// if 
	               }// inner for loop
			      
//	         System.out.println("In Outer For Loop");
//	         System.out.println();
	         if(isDistinct){//if(!isDistinct)--- for duplicate elements
	              System.out.print(arr[i]+" ");
	           }
		 }// outer for loop
		 System.out.println();
	}
		 
	     
	    public static void main(String a[]){
	         
	    	 int[] nums = {1,1,1,3,3,3,2,2,2,4,5};
//	    	 int[] nums = {1,2,3,4,5,6,1,2,3,4,5,6,7};
//	        int[] nums = {5,2,7,8,8,2,3,4,5,2,4,7,8,2,3};
	        System.out.println(nums.length);
	        
	        MyDisticntElements.printDistinctElements(nums);
	        
	      /*  List<Integer> u = new ArrayList<Integer>();
	        List<Integer> d = new ArrayList<Integer>();
	        Set<Integer> s = new HashSet<Integer>();
	        
	        
	        for (int j = 0; j < nums.length; j++) {
	        	if(s.add(nums[j])){

	        		u.add(nums[j]);
	        	}
	        	else{
	        		d.add(nums[j]);
	        	}
			}
	        
	       System.out.println("unique elements "+ u.toString()); 
	      Collections.sort(u);
	      System.out.println("Sorted unique elements "+ u.toString());
	        
	       System.out.println("duplicate elements "+ d.toString()); */
	    }
	    
	    int[] latestNum = {5,2,7,8,8,2,3,4,5,2,4,7,8,2,3};

	    
	}

