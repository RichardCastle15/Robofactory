package com.gmail.footballfan324.robofactory;

public class Robofactory {
	
	public Robofactory(){
		
	}
	/*This is Richard Castles answer to question:
	 *  https://community.topcoder.com/stat?c=problem_statement&pm=14537&rd=16878*/
	
	/*There are 3 scenarios that can happen. If we find a robot that gives a false answer then we can 
	 * identify it as the faulty one and return its index, if not then there are 2 further possibilities
	 * either the first one is the faulty one and it didn't show as it can never meet the requirements 
	 * to give the wrong answer, or the faulty one that isn't the first one didn't meet the requirements
	 * to give the wrong answer but is still faulty. If the numbers supplied were all odd, then any 
	 * faulty robot after the first one would be wrong, so we know the first one must be faulty. If
	 * there is one even number supplied (apart from the last number) then that could also be the faulty
	 * robot, so we cannot say for sure.*/
	public int reveal(int[] query, String[] answer){
		
		/*Assigns variables to check if all the numbers supplied (apart from last) were odd and one to 
		hold the number of robots (n)*/
		boolean allOdd = true;
		int n = query.length;
		
		//If there is only 1 robot, that must be the faulty one
		if(n == 1){
			return 0;
		}
		
		//for all robots
		for(int i = 0; i < n; i++){
			//if the answer is given by the robot is correct
			if(query[i]%2 == 0 && answer[i].equals("Even") || query[i]%2 == 1 && answer[i].equals("Odd")){
				/*If the number supplied is even and not the last one, then there could be a 
				 * malfunctioning robot that is not the first one*/
				if(query[i]%2 == 0 && i != n-1){
					allOdd = false;
				}
			}
			//if the robot got the answer wrong, return the index of that robot
			else{
				return i;
			}
		}
		
		/*if they're all odd and all the robots got the answer right (checked earlier) then the first
		 * robot must be the wrong one*/
		if(allOdd){
			return 0;
		}
		/*if there's an even number, then the next robot cannot be checked and we cannot figure out which
		robot is the malfunctioning one*/
		else{
			return -1;
		}
	}

}
