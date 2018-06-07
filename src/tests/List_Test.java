package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class List_Test {

	public static void main(String[] args) {
		
		/***
		 * List is used to store multiple elements with duplicates.
		 * 
		 * Vector--- Enumeration,Iterator,ListIterator
		 * ArrayList
		 * LinkedList
		 * 
		 */
		Vector <Integer> v = new Vector<Integer>();
		v.add(2);v.add(4);v.add(1);v.add(3);v.add(5);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "  ");
			
		}
		
		System.out.println();
		
		for (Integer integer : v) {
			System.out.print(integer+ "  ");
		}
		System.out.println();
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+ "  ");
		}
		
		System.out.println();
		
		Iterator<Integer> iter = v.iterator();
		
		while(iter.hasNext()){
			System.out.print(iter.next() + "  ");
		}
		
		System.out.println();
		
		ListIterator<Integer> li = v.listIterator();
		
		while(li.hasNext()){
			System.out.print(li.next() + "  ");
		}
		
		System.out.println();
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);al.add(4);al.add(1);al.add(3);al.add(5);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "  ");
			
		}
		
		System.out.println();
		
		for (Integer integer : v) {
			System.out.print(integer+ "  ");
		}
		System.out.println();
		Collections.sort(al);
		System.out.println(al.toString());
		Collections.reverse(al);
		System.out.println("Reverser order :"+al.toString());
		
		System.out.println("Max Element   :"+Collections.max(al));
		System.out.println("Min Element   :"+Collections.min(al));
	}
	
	
	

}
