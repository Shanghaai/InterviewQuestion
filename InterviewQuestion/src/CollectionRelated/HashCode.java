package CollectionRelated;

import java.util.HashSet;

public class HashCode 
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee("sahil");
		Employee e2= new Employee("sahil");
		Employee e3= new Employee("sahil");
		Employee e4= new Employee("sahil");
		
		System.out.println(e1.getName());
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		HashSet hs = new HashSet();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		System.out.println("added object are:"+hs);
		
		for (Object object : hs) {
			System.out.println(object);
		}
	}
}
