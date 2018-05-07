package tests;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;

import java.util.Set;
import java.util.TreeSet;


public class MapTest {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  
		
		  hm.put(102,"Rahul");  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  
		  System.out.println(hm.get(102));
		 
		  //getting only values
		  System.out.println(hm.values());
		 
		  Collection c = hm.values();
		  Iterator iterC = c.iterator();
		  while(iterC.hasNext())
			  System.out.println(iterC.next());
		  
		  for (String string : hm.values()) 
			System.out.println(string);
		//getting only keys
		  System.out.println(hm.keySet());

		  for(Map.Entry<Integer,String> m:hm.entrySet())  
		     System.out.println(m.getKey()+" "+m.getValue());  
		  
		  Set s = hm.entrySet();  
		  Iterator iter = s.iterator();
			
			while(iter.hasNext()){
				Map.Entry<Integer,String> map =  (Entry<Integer, String>) iter.next();
				System.out.println(map.getKey()+" "+map.getValue());
			}
			
			/*
			List<Integer> al = new ArrayList<Integer>();
			for (int i = 100; i <105; i++) 
				 al.add(i);
			
			al.add(5, 1000);
			
			for (int i = 0; i < al.size(); i++) {
				System.out.println("Normal for" + al.get(i));
			}

			for (Integer integer : al) {
				System.out.println("Enhanced for"+integer);
			}
			
			al.stream().forEach(System.out::println);
			
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Amit");
		ll.add("Vijay");
		ll.add("Rahul");
		ll.addFirst("Mr.");
		ll.addLast("Ends");
		System.out.println("ll.getFirst()"+ll.getFirst()+ll.get(1));
		System.out.println("ll.getLast()"+ll.getLast());

		
		ll.stream().forEach(System.out::println);*/
		
		/*// Integers
		Set<Integer> sset = new TreeSet<Integer>();
//		sset = new HashSet<Integer>();
//		sset = new LinkedHashSet<Integer>();
		sset.add(130);sset.add(101);sset.add(100);sset.add(120);sset.add(102);
		
		for (Integer integer : sset) {
			System.out.println(integer);
		}*/
		
		/*//Strings
		Set<String> sset = new TreeSet<String>();
//		sset = new HashSet<String>();
		sset = new LinkedHashSet<String>();
		sset.add("ADD");sset.add("CDD");sset.add("DEE");sset.add("EAF");sset.add("BAC");
		
		for (String integer : sset) {
			System.out.println(integer);
		}*/
			
			
		String data[] = {"a","b","a","d"};	
		
		List list = Arrays.asList(data);
		Set set = new HashSet(list);
		
		String afterSort[] = new String[set.size()];
		
		set.toArray(afterSort)	;
		
		for (String string : afterSort) {
			System.out.println(string);
		}
		
		Object obj[] = set.toArray();
		for (Object object : obj) {
			System.out.println("obj[]  "+object);
		}
	}

}
