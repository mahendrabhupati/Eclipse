package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7};
		ArrayList<Integer> change2Arralist= new ArrayList(Arrays.asList(arr));
		System.out.println(change2Arralist);
		List <Integer> li= new ArrayList<Integer>();
		li.add(1);
		li.add(5);
		li.add(6);
		li.add(2);
		li.add(1);
		Collections.sort(li);
		for(int i : li) {
			System.out.println(i);
		}
		Collections.shuffle(li);
		for(int i : li) {
			System.out.print("\t"+i);
		}
		List <Integer> l= new ArrayList<Integer>();
		
	}

}
