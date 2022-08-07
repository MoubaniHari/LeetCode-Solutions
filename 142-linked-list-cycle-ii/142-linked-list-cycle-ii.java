/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer>map=new HashMap<>();
        ListNode dummy=new ListNode(-100001);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp!=null)
        {
            if(map.containsKey(temp.next))
                return temp.next;
            map.put(temp,temp.val);
            temp=temp.next;
        }return null;
    }
}