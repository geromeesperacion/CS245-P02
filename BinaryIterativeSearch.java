/**
 * @author geromeesperacion
 */

package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {
	
	/*
	 * type of search algorithm used is binary iterative
	 */
	public String searchName() {
		return "Binary Iterative";
	}
	
	/*
	 * return the index of target in array, if not in array, return -1
	 */
	public int search(int[] arr, int target) {
		
		int min = 0;
		int max = arr.length-1;
		int mid;
		
		//loop until all of the array has been checked
		while(min <= max) {
			
			mid = (min + max) / 2;
			
			//if target found, return the index
			if(arr[mid] == target) {
				return mid;
			}
			
			//if the element is less than or more than the target, manipulate mid appropriately
			if(arr[mid] < target) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
			
		}
		
		//return -1 if target is not found in the array
		return -1;
		
	}
}
