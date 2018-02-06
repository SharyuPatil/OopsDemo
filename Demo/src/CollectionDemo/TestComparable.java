package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"1bc",15);
		Student s2=new Student(2,"acd",18);
		Student s3=new Student(4,"Aabc",12);
		Student s4=new Student(0,"abbc",14);
		
		List<Student> slist=new ArrayList<>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		System.out.println("Before sort--"+slist);
		Collections.sort(slist);
		System.out.println("after sort--"+slist);
		
		/*List<Integer> list2=new ArrayList<>();
		list2.add(8);
		list2.add(10);
		list2.add(2);
       Collections.sort(list2);
       System.out.println("numeric sort"+list2);*/
		Collections.sort(slist,new TComparator());
		System.out.println("comparator type sorting"+slist);
		
		
	}

}
class TComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	

}
