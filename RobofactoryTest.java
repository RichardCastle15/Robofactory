package com.gmail.footballfan324.robofactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobofactoryTest {

	@Test
	public void test() {
		
		Robofactory rf = new Robofactory();
		
		/*Example 0*/
		int[] query0 = {3,2,2};
		String[] answer0 = {"Odd","Odd","Even"};
		int example0answer = rf.reveal(query0, answer0);
		
		assertEquals(1, example0answer);
		
		/*Example 1*/
		int[] query1 = {1,3,5,10};
		String[] answer1 = {"Odd","Odd","Odd","Even"};
		int example1answer = rf.reveal(query1, answer1);
		
		assertEquals(0, example1answer);
		
		/*Example 2*/
		int[] query2 = {2,3,5,10};
		String[] answer2 = {"Even", "Odd", "Odd", "Even"};
		int example2answer = rf.reveal(query2, answer2);
		
		assertEquals(-1, example2answer);

		/*Example 3*/
		int[] query3 = {2,4,6,10};
		String[] answer3 = {"Even", "Even", "Even", "Even"};
		int example3answer = rf.reveal(query3, answer3);
		
		assertEquals(-1, example3answer);
		
		/*Example 4*/
		int[] query4 = {107};
		String[] answer4 = {"Odd"};
		int example4answer = rf.reveal(query4, answer4);
		
		assertEquals(0, example4answer);
		
		/*Example 5*/
		int[] query5 = {1,1,1};
		String[] answer5 = {"Odd", "Odd", "Even"};
		int example5answer = rf.reveal(query5, answer5);
		
		assertEquals(2, example5answer);
	}

}
