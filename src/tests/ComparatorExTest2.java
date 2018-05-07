package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student1 {
	
	int sid;
	String sname;
	int sage;
	
	Student1(int sid,String sname,int sage){
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
	}
}

class ArrayAge implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		
		
		return 0;
	}
	
}

class ArrayName implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		
		
		return 0;
	}
	
}


public class ComparatorExTest2 {

	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(3,"Srini",30));
		list.add(new Student1(13,"Anil",32));
		list.add(new Student1(1,"Priya",25));
		list.add(new Student1(2,"Satish",35));
		list.add(new Student1(5,"Alamelu",30));
		
		Collections.sort(list, new ArrayName());
		Collections.sort(list, new ArrayAge());
		
		
		for (Student1 student : list) {
			System.out.println(student.sid +"  "+ student.sname+"  "+student.sage);
		}
		
	}

}
