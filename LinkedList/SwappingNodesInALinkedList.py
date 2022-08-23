# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        curr=head
        n=0
        while curr:
            n+=1
            curr=curr.next
        
        i=1
        curr=head
        while i!=k:
                curr=curr.next
                i+=1
        val1=curr
        
        j=n-k
        curr=head
        while j:
            curr=curr.next
            j-=1
        val2=curr
        
        tmp=val1.val
        val1.val=val2.val
        val2.val=tmp
        
        return head
