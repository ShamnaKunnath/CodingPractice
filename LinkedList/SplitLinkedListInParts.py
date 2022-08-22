# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        curr=head
        n=0
        while curr:
            n+=1
            curr=curr.next
        r=n%k
        c=n//k
        res=[]
        
        j=r
        while j:
            res.append(head)
            i=c+1
            while i:
                prev=head
                head=head.next
                i-=1
            prev.next=None
            j-=1
            
        j=k-r
        while j:
            if n<k:
                res.append(None)
            else:
                res.append(head)
                i=c
                while i:
                    
                    prev=head
                    head=head.next
                    i-=1
                prev.next=None
            j-=1
        return res
