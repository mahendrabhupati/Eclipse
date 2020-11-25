package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// elements are numbers they are List of objects( They are wrapper class objects)
		// Collection is a interface --->List is a Interface which extends Collection
		// List has additional methods along with the methods in collection
		// list support Index numbers		
		List li= new ArrayList();		
		li.add(3);
		li.add(35);
		li.add(345.4);
		li.add(1, 69);// list Speciality
		li.add("hi");
		System.out.println(li);
		for(Object o: li) {
			System.out.println(o);
		}
		
	}

}
