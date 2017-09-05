/**
 * @author geromeesperacion
 */

package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {
	
	/*
	 * type of search algorithm used is linear search
	 */
	public String searchName() {
		return "Linear Search";
	}
	
	/*
	 * return the index of target in array, if not in array, return -1
	 */
	public int search(int [] arr, int target) {
		
		int size = arr.length;
		
		//loop through array to find target
		for(int i = 0; i < size; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		//return -1 if target is not found in the array
		return -1;
			
	}
}
