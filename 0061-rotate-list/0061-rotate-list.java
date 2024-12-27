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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null || k==0) return head;
        int len=1;
        ListNode tail = head;
    while(tail.next!=null){
      tail =  tail.next;
      len=len+1;
    }
    if(k%len==0){
        return head;
    }
    k= k %len;
    tail.next = head;
    ListNode newNode = findNthNode(head,len-k);
    head = newNode.next;
    newNode.next = null;

    return head; 
    }
    ListNode findNthNode(ListNode temp,int len){
        int cnt = 1;
        while(temp.next!=null){
            if(cnt==len)
                return temp;
                cnt++;
            temp=temp.next;
        }
        return temp;
    }
}