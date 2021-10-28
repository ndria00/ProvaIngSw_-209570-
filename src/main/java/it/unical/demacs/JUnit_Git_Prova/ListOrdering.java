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
	
	/*
	int min;
	for(int i = 0; i < myList.size(); ++i) {
		min = myList.get(0);
		for(int j = 0; j < myList.size(); ++j) {
			if(myList.get(j) < min)
				min = myList.get(j);
		}
		
		orderedList.add(min);
		myList.remove(min);
		
	}*/
}