package it.unical.demacs.JUnit_Git_Prova;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.joda.time.LocalTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class AppTest 
{

	private List<Integer> input;
	private List<Integer> expectedCrescente;
	private List<Integer> expectedDecrescente;
	private ListOrdering listOrdering;
	
	public AppTest(List<Integer> input, List<Integer> expectedCrescente, List<Integer> expectedDecrescente) {
		this.input = input;
		this.expectedCrescente = expectedCrescente;
		this.expectedDecrescente = expectedDecrescente;
		listOrdering = new ListOrdering();
	}
	
	@BeforeClass
	public static void printBeforeAllTests() {
		System.out.println(LocalTime.now());
	}
	
	
	@AfterClass
	public static void printAfterAllTests() {
		System.out.println(LocalTime.now());
	}
	
    @Test
    public void sortWorks()
    {
    	assertEquals(expectedCrescente, listOrdering.sort(input, 0));
    	assertEquals(expectedDecrescente, listOrdering.sort(input, 1));
    	
    }

    @Parameters
    public static Collection<Object[]> parametersForSortWorks(){
    	List<Integer>  input1= new ArrayList<Integer>();
    	input1.add(10);
    	input1.add(1);
    	input1.add(7);
    	input1.add(56);
    	
    	List<Integer>  expectedA1= new ArrayList<Integer>();
    	expectedA1.add(1);
    	expectedA1.add(7);
    	expectedA1.add(10);
    	expectedA1.add(56);
    	
    	List<Integer>  expectedD1= new ArrayList<Integer>();
    	expectedD1.add(56);
    	expectedD1.add(10);
    	expectedD1.add(7);
    	expectedD1.add(1);
    	
    	
    	List<Integer>  input2= new ArrayList<Integer>();
    	input2.add(11);
    	input2.add(26);
    	input2.add(75);
    	input2.add(12);
    	
    	List<Integer>  expectedA2= new ArrayList<Integer>();
    	expectedA2.add(11);
    	expectedA2.add(12);
    	expectedA2.add(26);
    	expectedA2.add(75);
    	
    	List<Integer>  expectedD2= new ArrayList<Integer>();
    	expectedD2.add(75);
    	expectedD2.add(26);
    	expectedD2.add(12);
    	expectedD2.add(11);
    	
    	return Arrays.asList(new Object[][] {{input1, expectedA1, expectedD1}, {input2, expectedA2, expectedD2}});
    	
    }
}
