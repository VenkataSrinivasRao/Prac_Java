package tests;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class LongestStringBetweenTwoChars {

	public static void main(String[] args) {
		
		String org = "The com1mon techn1ical inter1view ques1tion"; 
		
		String arr[] = org.split("t");
		int max = 0;
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
//			int temp = arr[i].length();
			m.put(arr[i],arr[i].length());
		}
		
		System.out.println(m.toString());
		 for(Map.Entry<String,Integer> km:m.entrySet())  
		     System.out.println(km.getKey()+" "+km.getValue()); 
		 
		 
		 
		String keyWithHighestVal = null;
		int maxValueInMap = (Collections.max(m.values()));
		
		for (Map.Entry<String,Integer> entry : m.entrySet()) {  
	        if (entry.getValue() == maxValueInMap) {
	        	keyWithHighestVal = entry.getKey();  
	        	System.out.println("longest String --> "+ keyWithHighestVal + " " + m.get(keyWithHighestVal));
	        }
		}

//		System.out.println("longest String --> "+m.get(keyWithHighestVal));
		
		
		
			/*Set s =  m.entrySet();  
			Iterator iter = s.iterator();
			while(iter.hasNext()){
				Map.Entry<Integer,String> map = (Entry<Integer, String>) iter.next();
				//System.out.println("Key -> "+map.getKey());
				//System.out.println("Value -> "+map.getValue());
				
			}*/
				

	}

}
