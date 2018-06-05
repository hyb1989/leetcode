/**
 * @Date 2018年6月4日
 * @Author hyb
 * @Version 1.0
 */
package leetcode.test01;

import java.util.Arrays;

/**
 * @author hyb_1
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] nums = {3,2,4} ;
		int target = 6 ;
		System.out.println(twoSum(nums, target));
	}

	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[] twoSum(int[] nums, int target) {
		
		int[] result = new int[2] ;
		for(int i=0;i<nums.length;i++) {
			int diff = target - nums[i] ;
			if(contains(nums, i, diff) != -1) {
				result[0] = i;
				result[1] = contains(nums, i, diff);
				return result ;
			}
		}
		
		return null;
		
	}
	
	private static int contains(int[] nums, int currentIndex, int diff) {
		
		for(int i=currentIndex + 1;i<nums.length;i++) {
			if(diff == nums[i]) {
				return i ;
			}
		}
		
		return -1;
		
	}
	
	private static boolean contains(String[] strArr, String value) {
		
		if(Arrays.asList(strArr).contains(value)) {
			return true ;
		}
		
		return false;
		
	}
	
	


}
