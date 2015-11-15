package com.interview.prep.amazon;

import java.util.HashSet;
import java.util.Set;

public class ArrayProblem {

	
	 /*
	  * Given an integer array and a constant number X, 
	  * print all pair of number in the array whose product is equal to X.
	  * 
	  * REmove duplicates as well
	 */
	
	HashSet <Integer> set = new HashSet<Integer>();
	
	void printNumberInArray(int array [], int number){
		
		for(int z : array){
		   set.add(z);
		}
		
		for(int digit : set){
			
			System.out.println("This is the digit  :" + digit);
			
			int pairelement = number / digit;
			
			if(set.contains(pairelement)){
				
				if(digit == pairelement){
					System.out.println(digit);
				}
				System.out.println(digit +"  "+pairelement);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		array[0] = 8;
		array[1] = 2;
		array[2] = 7;
		array[3] = 4;
		array[4] = 4;
		
		ArrayProblem array1 = new ArrayProblem();
		array1.printNumberInArray(array, 16);
		
	}
}
