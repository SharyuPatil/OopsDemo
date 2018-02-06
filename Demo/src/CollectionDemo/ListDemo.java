package CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l =new ArrayList<>();
		l.add(90);
		l.add(3);
		l.add(5);
		/*l.add(0);
		l.add(null);
		l.add(null);
		l.add(null);*/
		//l.remove(5);//give index of element
		//l.add(1, 60);//added to given location.
		
		List l2=new ArrayList<>();
		l2.add(5);
		l2.add(3);
		l2.add(90);
		//l.addAll(l2); //add all element from list to first list.
		//l2.addAll(l);//index and obj of list
		//l2.clear();
		/*boolean retval=l2.contains(5);
		if(retval==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		}
		*/
/*boolean result=l2.containsAll(l2);
if(result==true)
{
	System.out.println("present");
}
else
{
	System.out.println("not present");
}*/
		System.out.println(l2.equals(l));
		System.out.println(l2.get(2));
		//System.out.println(l2.hashCode()Code());
	
		
		
		
}
	
}
