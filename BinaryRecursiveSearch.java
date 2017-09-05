/**
 * @author geromeesperacion
 */

package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	/*
	 * type of search algorithm used is binary recursive
	 */
	public String searchName() {
		return "Binary Recursive";
	}
	
	/*
	 * return the index of target in array, if not in array, return -1
	 */
	public int search(int[] arr, int target) {
		int max = arr.length-1;
		
		return search(arr, target, 0, max);
	}
	
	//a new method is used to handle more parameters
	public int search(int[] arr, int target, int min, int max) {
		
		int mid = (min + max) / 2;

		//base case
		if(max < min) {
			return -1;
		}
		
		/* 
		 * step case - if target found, return index 
		 * else, update min and max and continue searching in updated boundaries
		 */
		if(arr[mid] == target) {
			return mid;
		} else if(arr[mid] > target) {		
			return search(arr, target, min, mid-1);
		} else {
			return search(arr, target, mid+1, max);
		}
	}
}
