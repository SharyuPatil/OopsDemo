package CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put("abc", 100);
		m.put("xyz", 200);
		m.put("dgf", 300);
		System.out.println("values by map:"+m);
		
		Set s=m.keySet();
		System.out.println("by keySet:"+s);//keyset1 print only keys.
		Collection c=m.values();
		System.out.println("by collection and map.values method:"+c);
		Set e=m.entrySet();
		System.out.println("by entrySet"+e);
		Iterator itr=e.iterator();
		System.out.println("----in iterator-----");
		while(itr.hasNext())
		{
			Map.Entry e1=(Map.Entry)itr.next();
			System.out.println(e1.getKey()+" "+e1.getValue());
			//System.out.println(itr.next());
			if(e1.getKey().equals("abc"))
			{
				e1.setValue(1000);
			}
			
		}
		System.out.println(m);
		}
		
		//m.put(3, "value");
		/*System.out.println(m.put(2," value"));
		System.out.println(m.put(2," new value"));
		System.out.println(m);//print new value if not duplicate then null else print value.
*/		

		
	}


