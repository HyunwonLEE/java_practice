package leetcode;

public class AddTwoNumbers_2 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4));
		l1 = new ListNode(4, new ListNode(3));
		l1 = new ListNode(3);

		ListNode l2 = new ListNode(5, new ListNode(6));
		l2 = new ListNode(6, new ListNode(4));
		l2 = new ListNode(4);

	}

}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuffer sum1 = new StringBuffer();
		StringBuffer sum2 = new StringBuffer();

		while (l1.next != null) {
			sum1.append(l1.val).append(sum1);
			l1 = new ListNode(l1.next.val, l1.next.next);

		}
		while (l2.next != null) {
			sum2 = l2.val + sum2;
			l2 = new ListNode(l2.next.val, l2.next.next);
		}

		return l2;

	}
}
//
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}
