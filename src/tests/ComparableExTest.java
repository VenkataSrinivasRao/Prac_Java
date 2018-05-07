package tests;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable{
	
	int sid;
	String sname;
	int sage;
	
	Student(int sid,String sname,int sage){
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
	}

	@Override
	public int compareTo(Object obj) {
		Student s =(Student)obj;
		return this.sage-s.sage;//ascending
//		return s.sage-this.sage;//descending
//		return sage - this.sage;
		
	}
	
}
public class ComparableExTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3,"Srini",30));
		list.add(new Student(2,"Satish",35));
		list.add(new Student(13,"Anil",32));
		list.add(new Student(1,"Priya",25));
		list.add(new Student(5,"Alamelu",30));
		
		Collections.sort(list);
		
		for (Student student : list) {
			System.out.println(student.sid +"  "+ student.sname+"  "+student.sage);
		}
		
	}

}
