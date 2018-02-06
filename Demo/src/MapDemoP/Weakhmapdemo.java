package MapDemoP;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Weakhmapdemo {
	
	public static void main(String[] args)throws Exception {
		Employee e=new Employee(1,"Megha");
		Employee e1=new Employee(2,"Souru");
		Employee e2=new Employee(3,"sharyu");
		
		Map<Employee,String> hmap=new HashMap<>();
		hmap.put(e1,"abc");
		hmap.put(e2, "xyz");
		System.out.println(hmap);
		
		WeakHashMap<Employee,String> whmap=new WeakHashMap<>();
		whmap.put(e1,"abc");
		whmap.put(e2, "xyz");
		System.out.println(whmap);
		e1=null;
		Thread.sleep(5000);
		System.gc();

		System.out.println(hmap);
		System.out.println(whmap);		//System.out.println(whmap.size());
		System.out.println(hmap.size());
		System.out.println(whmap.size());
		/*for (int i = 0; i < 100; i++) {
			System.out.println(hmap.size());
			System.out.println(whmap.size());
			
		}
		
			System.out.println(hmap.size());
			System.out.println(whmap.size());
		*/	
		
		
	}

}
class Employee
{
	int id;
	String  name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}