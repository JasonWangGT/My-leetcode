/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node, next;

		while (temp != null) {
			next = temp.next;
			if (next != null) {
				temp.val = next.val;
				if (next.next == null) {
					System.out.println(next.val + "  end");
					temp.next = null;
					break;
				}
			}

			temp = next;
		}
    }
}