/**
 * 
 */
package com.codingBat.colin;

/**
 * @author cfletch
 *
Given an array of ints, return true if 6 appears as 
either the first or last element in the array. 
The array will be length 1 or more. 

firstLast6({1, 2, 6}) → true
firstLast6({6, 1, 2, 3}) → true
firstLast6({13, 6, 1, 2, 3}) → false
 */
public class FirstLast6 {

	public boolean firstLast6(int[] nums) {
		  if (nums.length < 2) { // Test case for length 1. Unnecessary.
		      if (nums[0] == 6) {
		        return true;
		      }
		   } else if (nums[0] == 6) {
		      return true; 
		      } else if (nums[nums.length-1] == 6) {
		      
		      return true;
		      }
		      return false;
		}
	
}
