package MapDemoP;

import java.util.*;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class Test
{
	public static void main(String[] args)
	{
	    Address ad1=new Address("pune",123);
		Address ad2=new Address("Kolapur", 545);
		Address ad3=new Address("nagpur", 3537);
		
		Student st1=new Student(1,"sharyu",ad1);
		Student st2=new Student(2,"jyoti",ad2);
		Student st3=new Student(3,"arya",ad3);

		
		Map<Student,String> hmap=new HashMap<>();
		hmap.put(st1,"x");
		hmap.put(st2, "y");
		hmap.put(st3, "z");
		System.out.println("direct print hmap..."+hmap);//1


		Map<Student,String> lh=new Hashtable<>();
		lh.put(st1,"x");
		lh.put(st2, "y");
		lh.put(st3, "z");
		System.out.println(lh);
		//hashTableTest(lh);
		hashTableTest(hmap);
		
	}

	private static void hashTableTest(Map ob) {
	if (ob instanceof Hashtable) {
		//Hashtable new_name = (Hashtable) ob;
		System.out.println("Iterate with Enumaration");
		Hashtable<Student, String> hashTbl = (Hashtable<Student, String>)ob;
		Enumeration<String> enumr = hashTbl.elements();
		while(enumr.hasMoreElements()){
			System.out.println(enumr.nextElement()); // for iterator
		}
		System.out.println("........................");
		
		
		
	}
	else
	{
		Map<Student,String> hmap=new HashMap<>(ob);
		System.out.println("\nValues......... HashMap");
		for (String string : hmap.values()) {
			System.out.print(string);
		}
	/*	for (String string : ob.gethmap1.values()) {
			System.out.print(string);
		}*/
		System.out.println("\nKeySet......... HashMap");
		for (Student st : hmap.keySet()) {
			System.out.print(st);
		}
		System.out.println("\nEntrySet......... HashMap");
		for (Map.Entry<Student, String> string : hmap.entrySet()) {
			System.out.print(string);
		}
		System.out.println("\nIterator......EntrySet");
		Iterator<Map.Entry<Student, String>> itr = hmap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

		System.out.println("\nIterator......KeySet");
		Iterator<Student> itr1= hmap.keySet().iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next());
		}

		System.out.println("\nIterator......Values");
		Iterator<String> itr2=hmap.values().iterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next());
		}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		//result = prime * result + id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
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
/*//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
*/		return true;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
class Address
{
	String city;
	int pinCode;
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		//result = prime * result + pinCode;
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
		/*if (pinCode != other.pinCode)
			return false;*/
		return true;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
}
