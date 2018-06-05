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
		node1.setNext(node2);
		node2.setNext(node3);

		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		node4.setNext(node5);
		node5.setNext(node6);

		addTwoNumbers(node1, node4);
		// System.out.println(getNodeNumber(node1));
		// System.out.println(getNodeNumber(node4));

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode resultNode = null;

		int first = getNodeNumber(l1);
		int second = getNodeNumber(l2);

		int result = first + second;

		resultNode = transIntToNode(result);

		return resultNode;

	}

	/**
	 * @param result
	 * @return
	 */
	private static ListNode transIntToNode(int result) {

		String str = String.valueOf(result);
		StringBuilder sb = new StringBuilder(str);
		char[] charArr = sb.reverse().toString().toCharArray();
		ListNode l = null;
		for (char oneChar : charArr) {
			int num = oneChar - '0';
			if (l == null) {
				l = new ListNode(num);
			} else {
				if (null == l.getNext()) {
					l.setNext(new ListNode(num));
				} else {
					
				}
			}
		}

		return l;
	}

	/**
	 * @param l1
	 * @return
	 */
	private static int getNodeNumber(ListNode l1) {
		if (l1 == null || (null != l1 && l1.val == 0)) {
			return 0;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(l1.val);
		ListNode start = l1.next;
		while (start != null) {
			sb.append(start.val);
			start = start.next;
		}

		return Integer.valueOf(sb.reverse().toString());

	}

}
