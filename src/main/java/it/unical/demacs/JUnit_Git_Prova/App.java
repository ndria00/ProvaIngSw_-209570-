package it.unical.demacs.JUnit_Git_Prova;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> myList = new ArrayList<Integer>();
    	myList.add(10);
    	myList.add(1);
    	myList.add(7);
    	myList.add(56);
    	myList.add(0);
        ListOrdering test= new ListOrdering();
        
        System.out.println(myList.toString());
        
        System.out.println(test.sort(myList, 0).toString());
        System.out.println(test.sort(myList, 1).toString());
        
    }
}
