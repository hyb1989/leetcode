/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: leetcode.test03 
 * @author: hyb_1   
 * @date: 2018年6月10日 下午5:20:55 
 * @version: 1.0
 */
package leetcode.test03;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @author: hyb_1
 * @date: 2018年6月10日 下午5:20:56
 */
public class Solution {

	public int lengthOfLongestSubstring(String s) {

		int maxLen = 0;

		Map<Character, Integer> charPos = new HashMap<>();
		char[] charArr = s.toCharArray();
		int temp = 0;
		for (int i=0;i<charArr.length;i++) {
			if (!charPos.containsKey(charArr[i])) {
				charPos.put(charArr[i], i);
				temp++ ;
			} else {
				// 
				if(charPos.get(charArr[i]) + temp < i) {
					temp++;
				} else {
					maxLen = Math.max(maxLen, temp) ;
					temp = i - charPos.get(charArr[i]);
				}
				charPos.put(charArr[i], i);
			}
		}
		
		maxLen = Math.max(maxLen, temp) ;

		return maxLen;
	}

}
