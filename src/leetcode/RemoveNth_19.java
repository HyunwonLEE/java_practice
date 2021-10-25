package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveNth_19 {

	public static void main(String[] args) {

		ListNode head5 = new ListNode(5);
		ListNode head4 = new ListNode(4, head5);
		ListNode head3 = new ListNode(3, head4);
		ListNode head2 = new ListNode(2, head3);
		ListNode head = new ListNode(1, head2);

		int n = 2;
		removeNthFromEnd(head, n);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		while (head != null) {
			map.put(index++, head.val);
			head = head.next;
		}
		int rs_index = map.size() - n;


		for (int i = 0; i < map.size(); i++) {
			if (rs_index != i) {
				if(head == null) {
					head = new ListNode(map.get(i));
				}else {
					ListNode node = head;
					while (node.next != null) {
						node = node.next;
					}
					node.next = new ListNode(map.get(i));
				}
				

			}

		}
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}

		return head;
	}

}

//RAJ4JA3639, XJ15E10200
