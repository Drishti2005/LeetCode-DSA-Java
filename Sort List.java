/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode mid=middlenode(head);
        ListNode midnext=mid.next;
        midnext=null;
        ListNode A=sortList(head);
        ListNode B=sortList(midnext);
        return merge(A,B);
    }
    public ListNode middlenode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode A ,ListNode B){
        ListNode Dummy=new ListNode();
        ListNode temp=Dummy;
        while(A!=null && B!=null){
            if(A.val<B.val){
                Dummy=A;
                A=A.next;
                Dummy=Dummy.next;
            }
            else{
                 Dummy=B;
                B=B.next;
                Dummy=Dummy.next;
            }
        }
        if(A==null){
            Dummy.next=B;
        }
        if(B==null){
            Dummy.next=A;
        }
        return temp.next;
    }
}
