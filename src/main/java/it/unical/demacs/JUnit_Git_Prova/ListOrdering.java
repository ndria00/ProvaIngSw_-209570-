package it.unical.demacs.JUnit_Git_Prova;

import java.util.Comparator;
import java.util.List;

public class ListOrdering {
	

	public List<Integer> sort(List<Integer> myList, int order) {
		
		if(order == 0) {
			myList.sort(new Comparator<Integer>(){

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
				
			});
		}
		else if(order == 1) {
			
			myList.sort(new Comparator<Integer>(){

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
				
			});
		}
		return myList;
	}
}