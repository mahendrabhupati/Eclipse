package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		List<Integer> li= new ArrayList<>();
		li.add(9);
		li.add(4);
		li.add(16);
		li.add(88);
		System.out.println(li);// we will get o/p which is not sorted
		
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		// If I want to specify my own logic then
		
		
	}

}
