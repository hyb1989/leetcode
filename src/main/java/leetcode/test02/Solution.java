/**
 * @Date 2018年6月4日
 * @Author hyb
 * @Version 1.0
 */
package leetcode.test02;

/**
 * @author hyb_1
 *
 */
public class Solution {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;

		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		node4.next = node5;
		node5.next = node6;
		
		ListNode resultNode = addTwoNumbers(node1, node4) ;
		System.out.println(getNodeNumber(resultNode));

	}


	/**
	 * @param node1
	 * @param node4
	 * @return
	 */
	private static ListNode addTwoNumbers(ListNode node1, ListNode node4) {
		
		return getResultNode(node1, node4);
		
	}


	/**
	 * @param node1
	 * @param node4
	 * @return
	 */
	private static ListNode getResultNode(ListNode node1, ListNode node4) {
		
		ListNode resultNode = null;
		// 商 --> 进位
		int quotient = 0 ;
		// 余数
		int remainder = 0 ;
		while(! breakCondition(node1, node4)) {
			
			int sum = calcRootNumSum(node1, node4) + quotient;
			quotient = sum / 10 ;
			remainder = sum % 10 ;
			
			if(null == resultNode) {
				resultNode = new ListNode(remainder);
			} else {
				setLastNodeVal(resultNode, remainder);
			}
			
			if(null != node1) {
				node1 = node1.next;
			}
			
			if(null != node4) {
				node4 = node4.next;
			}
			
		}
		
		if(0 != quotient) {
			setLastNodeVal(resultNode, quotient) ;
		}
		
		return resultNode;
	}


	/**
	 * @param resultNode
	 * @param val
	 */
	private static void setLastNodeVal(ListNode resultNode, int val) {
		ListNode tempRoot = resultNode;
		while(null != tempRoot.next){
			tempRoot = tempRoot.next;
		}
		tempRoot.next = new ListNode(val);
	}


	/**
	 * @param node1
	 * @param node4
	 * @return
	 */
	private static int calcRootNumSum(ListNode node1, ListNode node4) {
		
		int val1 = getRootValue(node1);
		int val2 = getRootValue(node4);
		
		return val1 + val2;
		
	}


	/**
	 * @param node1
	 * @param node4
	 * @param resultNode 
	 * @return
	 */
	private static boolean breakCondition(ListNode node1, ListNode node4) {
		
		if(null == node1 && null == node4) {
			return true ;
		}
		
		return false ;
	}


	/**
	 * @param node1
	 * @return
	 */
	private static int getRootValue(ListNode node1) {
		
		if(null == node1) {
			return 0;
		}
		
		int val = node1.val;
		node1 = node1.next;
		return val;
	}
	
	private static long getNodeNumber(ListNode l1) {
		if (l1 == null) {
			return 0;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(l1.val);
		ListNode start = l1.next;
		while (start != null) {
			sb.append(start.val);
			start = start.next;
		}

		return Long.valueOf(sb.reverse().toString());

	}

}
