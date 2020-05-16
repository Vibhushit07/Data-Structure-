package Leet_Code_Challenge;

/*
	Given a singly linked list, group all odd nodes together followed by the even nodes. 
	Please note here we are talking about the node number and not the value in the nodes.
*/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null)
            return head;
        
        if(head.next == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddEnd = head;
        ListNode evenEnd = head.next;
        
        while((oddEnd != null && oddEnd.next != null) || (evenEnd != null && evenEnd.next != null)){
            
            if(oddEnd != null && oddEnd.next != null){
                oddEnd.next = oddEnd.next.next;
                oddEnd = oddEnd.next;
            }
            
            if(evenEnd != null && evenEnd.next != null){
                evenEnd.next = evenEnd.next.next;
                evenEnd = evenEnd.next;
            }
            
        }
        
        oddEnd = odd;
        while(oddEnd.next != null){
            oddEnd = oddEnd.next;
        }
        
        oddEnd.next = even;
            
            
        return odd;
        
    }
}