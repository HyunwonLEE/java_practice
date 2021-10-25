package leetcode;


public class MiddleLinkedList_876 {
	public static void main(String[] args) {
		ListNode listnode = new ListNode();
		listnode.val = 1;

		middleNode(listnode);

	}

	public static ListNode middleNode(ListNode head) {

		ListNode[] arr = new ListNode[100];
		int t = 0;
		while (head != null) {
			arr[t++] = head;
			head = head.next;
		}
		return arr[t / 2];
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	


	
}