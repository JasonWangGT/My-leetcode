/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode left = leftDummy, right = rightDummy;
        //partion the list into two list, one is less than x, one is equal to or more than x; the previous list's head node
        //is leftDummy, while the latter list's head node is rightDummy
        while(head != null){
            if(head.val < x){
                left.next = head;
                left = head;
            }
            else{
                right.next = head;
                right = head;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightDummy.next;
        return leftDummy.next;
    }
}