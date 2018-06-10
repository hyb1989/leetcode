/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: leetcode.test03 
 * @author: hyb_1   
 * @date: 2018年6月10日 下午7:06:10 
 * @version: 1.0
 */
package leetcode.test03;

import org.junit.Test;

import leetcode.test03.Solution;

/** 
 * @ClassName: SolutionTest 
 * @Description: TODO
 * @author: hyb_1
 * @date: 2018年6月10日 下午7:06:10  
 */
public class SolutionTest {
	
	String str1 = "abcabcbb";
	String str2 = "bbbbb" ;
	String str3 = "pwwkew" ;

	@Test
	public void lengthOfLongestSubstringTest() {
		System.out.println(new Solution().lengthOfLongestSubstring(str1));
		System.out.println(new Solution().lengthOfLongestSubstring(str2));
		System.out.println(new Solution().lengthOfLongestSubstring(str3));
	}

}
