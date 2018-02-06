package com.scp.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address(123456,"pune");
		Address ad2=new Address(416229,"Kolapur");
		Address ad3=new Address(567800,"nagpur");
		
		Student st1=new Student(1,"sharyu",ad1);
		Student st2=new Student(2,"jyoti",ad1);
		Student st3=new Student(3,"arya",ad3);
		Student st4=new Student(4,"aish",ad2);
		Student st5=new Student(5,"trupti",ad2);

		Set<Student> s=new HashSet<>();
		s.add(st1);
		s.add(st2);
		s.add(st3);
		s.add(st4);
		s.add(st5);
		//s.add(st5);
		
		System.out.println("\n--set operation --\n"+s);
		
		Map<Student,String> map=new HashMap<>();
		map.put(st1, "xyz");
		map.put(st2, "abc");
		map.put(st3, "def");
		map.put(st4, "ert");
		map.put(st5, "sqp");
		
		System.out.println("\nUsing Hashmap:\n"+map);
		
		LinkedHashMap<Student,String> lhm=new LinkedHashMap<>();
		lhm.put(st1, "xyz");
		lhm.put(st2, "abc");
		lhm.put(st3, "def");
		lhm.put(st4, "ert");
		lhm.put(st5, "sqp");
		System.out.println("\nUsing LinkedHashmap:\n"+lhm);
		
		Hashtable<Student,String> ht=new Hashtable<>();
		ht.put(st1, "xyz");
		ht.put(st2, "abc");
		ht.put(st3, "def");
		ht.put(st4, "ert");
		ht.put(st5, "sqp");
		System.out.println("\nUsing Hashtable:\n"+ht);
		
		loopingOfMapObjects(lhm);
		
		
		
	}

	private static void loopingOfMapObjects(LinkedHashMap<Student, String> lhm) {
		// TODO Auto-generated method stub
		System.out.println("\n-------iterate with iterator------\n");
		System.out.println("for keyset\n");
		Set<Student> set=lhm.keySet();//by keyset1
		for(Student stud:set){
			System.out.println("key"+stud +"value"+lhm.get(stud));
			
		}
		System.out.println("\n");
		
		List<Student> list=new ArrayList<>(set);//by Array list 2 for key set
		for(int i=0;i<list.size();i++)
		{
			System.out.println("key"+list.get(i)+"value"+lhm.get(list.get(i)));
			
		}
		System.out.println("\n");
		Iterator<Student> itr=set.iterator();//by using iterator 3 for key set
		while(itr.hasNext())
		{
			Student s1=(Student)itr.next();
			System.out.println("key"+s1   + "value"+lhm.get(s1));
		}
		System.out.println("\nfor entryset");
		Set<Map.Entry<Student,String>> mapval=lhm.entrySet();
		System.out.println(mapval);
	
		List<Student> list1=new ArrayList<>();
		for(int j=0;j<list1.size();j++)
		{
			System.out.println("key"+list1.get(j));
		}
	
	}
	
	
   
	

}
class Student
{
	int id;
	String name;
	Address address;
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		/*result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
class Address
{
	int pin;
	String city;
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		/*result = prime * result + pin;*/
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pin != other.pin)
			return false;
		return true;
	}
	
}