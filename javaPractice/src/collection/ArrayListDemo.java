package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Collection is a interface --->List is a Interface which extends Collection
		// Collection doesn't support index number
		// Collection support duplicate values
		
//		Collection values= new ArrayList();
//		values.add(9);
//		values.add(923);
//		values.add(9);
//		values.add("hi there");
// System.out.println(values); //which gives all values
		
		// Arraylist is a class which implements List		
		// if I want the collection to store only integers then use generics
		// Iterator iterates over collection
		//Since it doesn't index number we can add elements in between
				Collection <Integer> num= new ArrayList<>();
				num.add(4);
				num.add(345);
				num.add(345);
				num.add(34234);
			System.out.println(num);// Gives all values in Collection
			
			Iterator ir=num.iterator(); 
			System.out.println(ir.next());
			System.out.println(ir.next());
			while(ir.hasNext()) {
				System.out.println(ir.next());
			}
			
			
				
				
	}

}
